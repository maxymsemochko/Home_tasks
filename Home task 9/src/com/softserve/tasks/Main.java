package com.softserve.tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static double div(double a, double b){
        double res = 0;

        try {
            res = a/b;
            if (res == Double.POSITIVE_INFINITY ||
                    res == Double.NEGATIVE_INFINITY){

                throw new ArithmeticException();}
        } catch (ArithmeticException e){
        System.err.println("Zero Exception");
        res =0;
        }catch (Exception e){
            System.err.println("Exception "+e.getMessage());
        }
        return res;
    }

    public static int readNumber(int start,int end)
    {
        int number = 0;
        try {
            number = Integer.parseInt(br.readLine());
            if (number>end||number<start)
            {
             throw new ArithmeticException("Invalid Number");
            }
        }catch (IOException e)
        {
            System.err.println("IOException "+ e.getMessage());
        }catch (NumberFormatException e){
            throw new NumberFormatException("Not a number");
        }
        return number;
    }




    public static void main(String[] args) {

        System.out.println("Please input 2 numbers");
        double number1=0;
        double number2=0;

        try {

            number1 = Double.parseDouble(br.readLine());
            number2 = Double.parseDouble(br.readLine());
        }catch (IOException e)
        {
            System.err.println("IOException "+ e.getMessage());
        }catch (NumberFormatException e){
            System.err.println("NumberFormatException "+ e.getMessage());
        }catch (Exception e){
            System.err.println("Exception "+e.getMessage());
        }

            System.out.println(div(number1, number2));

        System.out.println("Enter 10 numbers from 1 to 100");
        for (int i = 0; i < 10; i++) {
            System.out.println(readNumber(1,100));
        }






    }
}
