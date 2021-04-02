package com.softserve.tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void taskA(int n)
    {
        String square=Integer.toString(n*n);
        if (square.contains("3"))
        {
            System.out.println("There is number 3 in square of your number");
        }else {
            System.out.println("There is not number 3 in square of your number");
        }
    }

    public static void taskB(int n)
    {
        String number = Integer.toString(n);
        String reversed = "";
        for (int i = 0; i < number.length(); i++) {
            reversed = number.charAt(i)+reversed;

        }
        System.out.println("Your reversed number is: "+reversed);
    }

    public static void taskC(int n)
    {
        String number = Integer.toString(n);
        char firstNumber = number.charAt(0);
        char lastNumber = number.charAt(number.length()-1);
        String newNumber = number.substring(1,number.length()-1);
        newNumber = lastNumber + newNumber + firstNumber;

        System.out.println("Changed number is: "+newNumber);

    }

    public static void taskD(int n)
    {
        String number = Integer.toString(n);

        number = 1+number+1;

        System.out.println("Your number and 1 on start and at the end of it is: "+number);

    }




    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Please, enter a natural number");
        int n = Integer.parseInt(br.readLine());
        if (n<=0)
        {
            System.out.println("You entered incorrect number, please enter number >0");
            n=Integer.parseInt(br.readLine());
        }
        taskA(n);
        taskB(n);
        taskC(n);
        taskD(n);


    }
}
