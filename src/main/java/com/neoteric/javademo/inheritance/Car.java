package com.neoteric.javademo.inheritance;

import java.util.List;

public class Car {

    private  Engine engine;
//
//    private List<Wheel> wheelList;
    public Car(Engine engine, List<Wheel> wheelList) {
        this.engine = engine;
    }

}
