package com.company;

public class Green implements Light {

    public Light changeLight (){
        System.out.println("Red");
        return new Red();
    }

}
