package com.company;

public class Yellow implements Color {

    public Color changeColor (){
        System.out.println("Green");
        return new Green();
    }
}
