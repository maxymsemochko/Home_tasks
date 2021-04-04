package com.softserve.tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                                    // Task №1
//        System.out.println("Enter a radius of flower bed to calculate its perimeter and area.");
//        float radius = Float.parseFloat(br.readLine());
//        double perimeter, area;
//
//        perimeter = 2*(Math.PI*radius);
//        area = Math.PI*radius*radius;
//
//        System.out.printf("Flower bed perimeter is %f, and its area is %f", perimeter,area);
                                    // Task №2
        String name, address;
        System.out.println("What is your name?");
        name = br.readLine();
        System.out.printf("Where do you live, %s\n", name);
        address = br.readLine();
        System.out.printf("Hello %s, you live in %s",name,address);
                                    // Task №3
        





    }
}
