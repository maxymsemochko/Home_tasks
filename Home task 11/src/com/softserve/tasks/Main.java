package com.softserve.tasks;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<Student>();

        Student stud1 = new Student("Dariy",2);
        Student stud2 = new Student("Ostap",3);
        Student stud3 = new Student("Maxim",6);
        Student stud4 = new Student("Petro",1);
        Student stud5 = new Student("Ivan",2);

        students.add(stud1);
        students.add(stud2);
        students.add(stud3);
        students.add(stud4);
        students.add(stud5);


        System.out.println("Students of 2 course");
        Student.printStudents(students,2);

        System.out.println("\nNot sorted list");
        System.out.println(students);

        System.out.println("\nSorted list by name");
        students.sort(new NameComparator());
        System.out.println(students);

        System.out.println("\nSorted list by course");
        students.sort(new CourseComparator());
        System.out.println(students);













    }

}
