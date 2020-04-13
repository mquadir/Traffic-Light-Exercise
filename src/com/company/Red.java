package com.company;

public class Red implements Color {

    public Color changeColor (){
        System.out.println("Yellow");
        return new Yellow();
    }

}
