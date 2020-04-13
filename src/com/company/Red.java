package com.company;

public class Red implements Light {

    public Light changeLight(){
        System.out.println("Yellow");
        return new Yellow();
    }

    public void printLight(){
        System.out.println("Red");
    }

}
