package com.softserve.tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Task №1
        System.out.println("Enter a radius of flower bed to calculate its perimeter and area.");
        float radius = Float.parseFloat(br.readLine());
        double perimeter, area;

        perimeter = 2*(Math.PI*radius);
        area = Math.PI*radius*radius;

        System.out.printf("Flower bed perimeter is %f, and its area is %f", perimeter,area);

        // Task №2
        String name, address;
        System.out.println("What is your name?");
        name = br.readLine();
        System.out.printf("Where do you live, %s\n", name);
        address = br.readLine();
        System.out.printf("Hello %s, you live in %s",name,address);

        //Task №3
        System.out.println("How much standard units per minute does first call costs?");
        double c1 = Double.parseDouble(br.readLine());
        System.out.println("How many minutes it lasted?");
        int t1 = Integer.parseInt(br.readLine());

        System.out.println("How much standard units per minute does second call costs?");
        double c2 = Double.parseDouble(br.readLine());
        System.out.println("How many minutes it lasts?");
        int t2 = Integer.parseInt(br.readLine());

        System.out.println("How much standard units per minute does third call costs?");
        double c3 = Double.parseDouble(br.readLine());
        System.out.println("How many minutes it lasts?");
        int t3 = Integer.parseInt(br.readLine());

        System.out.printf("First call costs %f standard units per minute.", c1*t1);
        System.out.printf("\nSecond call costs %f standard units per minute.", c2*t2);
        System.out.printf("\nThird call costs %f standard units per minute.", c3*t3);

        System.out.printf("All calls costs %f standard units per minute", (c1*t1)+(c2*t2)+(c3*t3));
    }
}