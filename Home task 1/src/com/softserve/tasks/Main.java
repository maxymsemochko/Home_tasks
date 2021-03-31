package com.softserve.tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Whether the brick will pass into the hole?");

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
        int a = brick[0];
        int b = brick[1];
        int c = brick[2];



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
        int x = hole[0];
        int y = hole[1];


        if(c<=y&b<=x|b<=y&c<=x|c<=y&a<=x|a<=y&c<=x|a<=y&b<=x|b<=y&a<=x)
        {
            System.out.println("Brick entered");
        }
        else
        {
            System.out.println("Brick didn't enter");
        }

    }
}
