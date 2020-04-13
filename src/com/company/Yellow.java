package com.company;

public class Yellow implements Light {


    public Light changeLight (){
        System.out.println("Green");
        return new Green();
    }

    public void printLight(){
        System.out.println("Yellow");
    }
}
