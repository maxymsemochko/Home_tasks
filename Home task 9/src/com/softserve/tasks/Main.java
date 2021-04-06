package com.softserve.tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static double div(double a, double b){
        return a/b;
    }

    public static int readNumber(int start, int end) {
        try {
            int a = Integer.parseInt(br.readLine());
            if (a>=start&&a<=end) {
                return a;
            }
        }catch (IOException e) {
            System.err.println("IOException "+e.getMessage());
        }catch (NumberFormatException e) {
            System.err.println("It's not a number!\n" + e.getMessage());
        }catch (ArithmeticException e){
            System.err.println("You can't divide on 0!\n"+e.getMessage());
        }catch (Exception e){
            System.err.println("Exception "+e.getMessage());
        }


    }

    public static void main(String[] args) {

        System.out.println("Please input 2 numbers");
        try {

            double number1 = Double.parseDouble(br.readLine());
            double number2 = Double.parseDouble(br.readLine());
            System.out.println(div(number1, number2));

        } catch (IOException e) {
            System.err.println("IOException "+e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("It's not a number!\n" + e.getMessage());
        }catch (ArithmeticException e){
            System.err.println("You can't divide on 0!\n"+e.getMessage());
        }catch (Exception e){
            System.err.println("Exception "+e.getMessage());
        }


    }
}
