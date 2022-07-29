package com.deloitte.firstStringApp.dependency;

import org.springframework.stereotype.Component;

@Component
public class Printer {

    public void print() {
        System.out.println("Hello world!");
    }
}
