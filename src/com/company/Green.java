package com.company;

public class Green implements Color {

    public Color changeColor (){
        System.out.println("Red");
        return new Red();
    }
}
