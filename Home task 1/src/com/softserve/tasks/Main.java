package com.softserve.tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Whether the brick will pass into the hole?");


        System.out.println("Please enter first side of brick.");
        int a = Integer.parseInt(br.readLine());
        if (a<=0)
        {
            System.out.println("You entered incorrect number, please enter number >0");
            a=Integer.parseInt(br.readLine());
        }

        System.out.println("Please enter second side of brick.");
        int b = Integer.parseInt(br.readLine());
        if (b<=0)
        {
            System.out.println("You entered incorrect number, please enter number >0");
            b=Integer.parseInt(br.readLine());
        }

        System.out.println("Please enter third side of brick.");
        int c = Integer.parseInt(br.readLine());
        if (c<=0)
        {
            System.out.println("You entered incorrect number, please enter number >0");
            c=Integer.parseInt(br.readLine());
        }



        System.out.println("Please input height of hole");
        int x = Integer.parseInt(br.readLine());
        if (x<=0)
        {
            System.out.println("You entered incorrect number, please enter number >0");
            x=Integer.parseInt(br.readLine());
        }

        System.out.println("Please input width of hole");
        int y = Integer.parseInt(br.readLine());
        if (y<=0)
        {
            System.out.println("You entered incorrect number, please enter number >0");
            y=Integer.parseInt(br.readLine());
        }

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
