package com.softserve.tasks;

public class Employee {
    protected String employeedId;
    protected String name;

    public Employee(String employeedId, String name) {
        this.employeedId = employeedId;
        this.name = name;
    }
    public Employee() {}

    public Employee(String name) {
        this.name = name;
    }


}
