package com.softserve.tasks;

public class Person {
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

    public int age(int currentYear){
        return  currentYear - this.birthYear;
    }

    public void input(String name, int birthYear){
        setName(name);
        setBirthYear(birthYear);
    }

    public void output(int currentYear){
        System.out.println("Info about person");
        System.out.println("Name: "+this.name);
        System.out.println("Birthday year: "+ birthYear);
        System.out.println("Age: "+age(currentYear));
    }

    public void changeName(String name){
        this.name = name;
    }





}
