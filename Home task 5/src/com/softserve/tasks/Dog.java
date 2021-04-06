package com.softserve.tasks;

import java.util.Objects;

public class Dog {

    private String name;
    private String breed;
    private int age;



    public Dog(String name,String breed, int age) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }



    public Dog(){}


    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }


}
