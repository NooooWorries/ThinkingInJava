package com.ch02.sec7;

import java.util.Date;
import java.util.Properties;

public class Property {
    public static void main (String[] args){
        System.out.println(new Date());
        Properties properties = System.getProperties();
        properties.list(System.out);

        System.out.println("Memory usage:");
        Runtime runtime = Runtime.getRuntime();

        System.out.println("Total Memory:" + runtime.totalMemory());
        System.out.println("Free Memory:" + runtime.freeMemory());

    }
}
