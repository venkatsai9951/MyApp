package com.Victor.MyApp;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer {
    public void compile() {
        System.out.println("This is laptop compiling with no errors");
    }

}
