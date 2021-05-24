package com.maven.example.logs;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.*;


public class LoggingExample {
     Logger logger = Logger.getLogger(LoggingExample.class.getName());

    public  void logged() {
        try {
            LogManager.getLogManager().readConfiguration(new FileInputStream(
                    "src/mylogging.properties"));
        } catch (SecurityException | IOException e1) {
            e1.printStackTrace();
        }
        logger.setLevel(Level.FINE);
      /*
       logger.addHandler(new ConsoleHandler());
        logger.addHandler(new MyHandler());
        try {
            Person person=new Person();
            Handler fileHandler = new FileHandler("C:\\Users\\cimbo\\" +
                    "Desktop\\Java\\workingwithmaven\\src\\" +
                    "main\\java\\com\\maven\\example" +
                    "\\logger.log", 2000, 5);
            fileHandler.setFilter(new MyFilter());
            fileHandler.setFormatter(new MyFormatter());
            logger.addHandler(fileHandler);

            logger.log(Level.INFO,person.getName());
            logger.log(Level.INFO,person.getSurName());
            logger.log(Level.INFO,String.valueOf(person.getAge()));

        } catch (SecurityException | IOException e) {
            e.printStackTrace();
        }
       */

    }
}
