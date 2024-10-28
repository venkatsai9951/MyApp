package com.Victor.MyApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Dev {
    // Laptop laptop = new Laptop(); basic object creation.
    @Autowired
    private Computer comp; // field injection

    // public Dev(Laptop laptop) { Constructor Injection
    // this.laptop = laptop;
    // }
    // @Autowired
    // public void set(Laptop laptop) { Setter Injection
    // this.laptop = laptop;
    // }

    public void build() {
        System.out.println("Thiis build method is for sure working");
        comp.compile();
    }

}
