package com.maven.example.logs;

import java.util.logging.Formatter;
import java.util.logging.LogRecord;

public class MyFormatter extends Formatter {

    @Override
    public String format(LogRecord record) {

        return record.getSourceClassName()+" "+record.getSourceMethodName()+" "+record.getMessage()+"\n";
    }
}