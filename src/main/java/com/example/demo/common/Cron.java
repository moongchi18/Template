package com.example.demo.common;

public class Cron {

    public static final String EVERY_SECOND;
    public static final String EVERY_MINUTE;
    static {
        EVERY_SECOND = "0/1 * * * * *";
        EVERY_MINUTE = "0 0/1 * * * *";
    }
}
