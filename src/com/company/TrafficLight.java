package com.company;

public class TrafficLight implements Light{

    Light state;

    TrafficLight(Light l){
        this.state = l;
    }

    public Light changeLight(){
        this.state = state.changeLight();
        return state;
    }

}
