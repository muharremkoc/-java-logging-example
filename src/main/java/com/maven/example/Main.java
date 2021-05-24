package com.maven.example;

import com.maven.example.logs.LoggingExample;
import com.maven.example.logs.MyFormatter;
import com.maven.example.logs.MyHandler;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.*;

public class Main {
    static Person person=new Person();
   static Logger loggers = Logger.getLogger(LoggingExample.class.getName());
    public static void main(String[] args) {

        LoggingExample loggingExample=new LoggingExample();
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String surName = scanner.nextLine();
        int age=scanner.nextInt();

        person.setName(name);
        person.setSurName(surName);
        person.setAge(age);
        loggingExample.logged();
        logger();
    }
    public static void logger(){
        //loggers.addHandler(new ConsoleHandler());
        loggers.addHandler(new MyHandler());
        try {
            Handler fileHandler = new FileHandler("C:\\Users\\cimbo\\" +
                    "Desktop\\Java\\workingwithmaven\\src\\" +
                    "main\\java\\com\\maven\\example" +
                    "\\logger.log", 2000, 5);
            fileHandler.setFormatter(new MyFormatter());
            loggers.addHandler(fileHandler);

            loggers.log(Level.INFO,"Loglama Islemi Basladi:"+person.getName());
            loggers.log(Level.INFO,"\"Loglama Islemi Basladi:\""+person.getSurName());
            loggers.log(Level.INFO,"\"Loglama Islemi Basladi:\""+String.valueOf(person.getAge()));

        } catch (SecurityException | IOException e) {
            e.printStackTrace();
        }
    }
}
