package com.softserve.tasks;

import java.util.*;

public class Student {
    private String name;
    private int course;


public static void printStudents(List students, int course){
    ListIterator<Student> iterator = students.listIterator(0);
    while (iterator.hasNext()) {
        Student element =iterator.next();
        if (element.getCourse() == course) {
            System.out.println(element);
        }
    }

}


    public Student() {}
    public Student(int course) {
        this.course = course;
    }

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return name+" course "+course;
    }



}
