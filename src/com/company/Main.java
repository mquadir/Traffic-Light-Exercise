package com.company;

public class Main {

    public static void main(String[] args) {
        // Random Light instance
        Light light = new Red();

        // Traffic Light instance of light
        TrafficLight tl = new TrafficLight(light);

        tl.changeLight();
        tl.changeLight();
        tl.changeLight();

    }
}
