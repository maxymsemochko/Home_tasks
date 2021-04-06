package com.softserve.tasks;

public class NonFlyingBird extends Bird{


    @Override
    void fly() {
        System.out.println("I'm not flying bord");
    }
}
