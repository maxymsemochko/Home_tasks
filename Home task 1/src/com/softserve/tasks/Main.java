package com.softserve.tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("whether the brick will pass into the hole?");
        int x,y;


        int[] brick = new int[3];
        int[] hole = new int[2];

        for (int i = 0; i < brick.length; i++) {
            System.out.println("Please enter a "+(i+1)+" side of brick.");
            brick[i]= Integer.parseInt(br.readLine());
            if (brick[i]<=0)
            {
                System.out.println("You entered incorrect number, please enter number >0");
                brick[i]=Integer.parseInt(br.readLine());
            }
        }
        Arrays.sort(brick);


        System.out.println("Please input height of hole");

        for (int i = 0; i < hole.length ; i++) {
            System.out.println("Please enter a "+(i+1)+" side of hole.");
            hole[i]=Integer.parseInt(br.readLine());
            if (hole[i]<=0)
            {
                System.out.println("You entered incorrect number, please enter number >0");
                hole[i]=Integer.parseInt(br.readLine());
            }
        }
        Arrays.sort(hole);

        if (brick[2]<=hole[1]&brick[1]<=hole[0]|
                brick[1]<=hole[1]&brick[2]<=hole[0]|
                brick[2]<=hole[1]&brick[0]<=hole[0]|
                brick[0]<=hole[1]&brick[2]<=hole[0]|
                brick[0]<=hole[1]&brick[1]<=hole[0]|
                brick[1]<=hole[1]&brick[0]<=hole[0])
        {
            System.out.println("Brick entered");
        }
        else
        {
            System.out.println("Brick didn't enter");
        }

    }
}
