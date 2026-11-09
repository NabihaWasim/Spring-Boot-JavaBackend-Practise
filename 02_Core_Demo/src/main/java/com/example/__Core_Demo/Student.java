package com.example.__Core_Demo;

import org.springframework.stereotype.Component;

@Component 
public class Student {
    private final Laptop lappy;
    public Student(Laptop lappy){
        this.lappy=lappy;
    }
    public void stu(){
        System.out.println("Student bough the laptop");
        lappy.buy();
    }
}
