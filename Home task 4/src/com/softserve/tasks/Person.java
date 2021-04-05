package com.softserve.tasks;

import java.util.Calendar;

public class Person {
    private int currentYear = Calendar.getInstance().get(Calendar.YEAR);
    private String name;
    private int birthYear;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public Person(){}
    public Person(String name, int birthYear){
        this.name = name;
        this.birthYear = birthYear;
    }

    public int age(){
        return  this.currentYear - this.birthYear;
    }

    public void input(String name, int birthYear){
        setName(name);
        setBirthYear(birthYear);
    }

    public void output(){
        System.out.println("Info about person");
        System.out.println("Name: "+this.name);
        System.out.println("Birthday year: "+ birthYear);
        System.out.println("Age: "+age());
    }

    public void changeName(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person " +
                "name is " + name +
                ", age=" + age();
    }
}
