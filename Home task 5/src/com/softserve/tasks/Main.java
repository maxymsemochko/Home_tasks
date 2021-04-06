package com.softserve.tasks;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
   static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static String task1_1(float a, float b, float c) throws IOException {

        if ((a >= -5 & a <= 5) && (b >= -5 & b <= 5) && (c >= -5 & c <= 5))
            return "All numbers belong to the range [-5;5]";
        else
            return "One or more numbers don't belong to the range [-5;5]";

    }

    public static void task1_2() throws IOException {
        int arr[] = new int[3];
        System.out.printf("Input %d int numbers to do task\n", arr.length);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        System.out.printf("Min number is %d, max number is %d\n", arr[0], arr[arr.length - 1]);
    }

    public static void task1_3() throws IOException {
        System.out.println("Please input a number of HTTP error from 400 to 405");


        int HTTPError = Integer.parseInt(br.readLine());
        if (HTTPError>405|HTTPError<400){
            System.out.println("You picked the wrong house f**l\n" +
                    "Please input a number of HTTP error from 400 to 405");
            HTTPError = Integer.parseInt(br.readLine());
        }

        switch (HTTPError){
            case 400:
                System.out.println("400 Bad Request");
                break;
            case 401:
                System.out.println("401 Unauthorized (RFC 7235)");
                break;
            case 402:
                System.out.println("402 Payment Required");
                break;
            case 403:
                System.out.println("403 Forbidden");
                break;
            case 404:
                System.out.println("404 Not Found");
                break;
            case 405:
                System.out.println("405 Method Not Allowed");
                break;
        }
    }

    public static void main(String[] args) throws IOException {

        System.out.println("Please input 3 float numbers to do my task");
        float a1 = Float.parseFloat(br.readLine());
        float b1 = Float.parseFloat(br.readLine());
        float c1 = Float.parseFloat(br.readLine());
        System.out.println(task1_1(a1,b1,c1));


        task1_2();


        task1_3();


        System.out.println("----------Task with dogs----------");

        Dog dog1 = new Dog("Sem","Bulldog",2);

        Dog dog2 = new Dog("Pem","Akita",4);

        Dog dog3 = new Dog("Barsik","Chihuahua", 5);

        if (dog1.getName()==dog2.getName()||dog1.getName()==dog3.getName()||dog2.getName()==dog3.getName()){
            System.out.println("There is dogs with same name");
        }else
            System.out.println("There is no dogs with same name");


        if (dog1.getAge()> dog2.getAge()&&dog1.getAge()> dog3.getAge())
            System.out.printf("%s is %s and his age is %d is the oldest\n",dog1.getName(),dog1.getBreed(),dog1.getAge());

        if (dog2.getAge()> dog1.getAge()&&dog2.getAge()> dog3.getAge())
            System.out.printf("%s is %s and his age is %d is the oldest\n",dog2.getName(),dog2.getBreed(),dog3.getAge());

        if (dog3.getAge()> dog1.getAge()&&dog3.getAge()> dog2.getAge())
            System.out.printf("%s is %s and his age is %d and he is the oldest dog\n",dog3.getName(),dog3.getBreed(),dog3.getAge());











    }
}
