package com.kodilla.patterns.singleton;

public enum Logger {

    LOG_IN;

    private String lastLog = "";

    public void log (String log) {
        lastLog = log;
        System.out.println("Log: [" + log + "]");
    }

    public String getLastLog() {
        return lastLog;
    }
}
