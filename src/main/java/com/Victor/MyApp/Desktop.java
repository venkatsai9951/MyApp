package com.Victor.MyApp;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Desktop implements Computer {
    public void compile() {
        System.out.println("This is Desktop compiling with no errors");
    }

}
