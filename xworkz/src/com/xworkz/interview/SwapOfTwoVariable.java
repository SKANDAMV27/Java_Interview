package com.xworkz.interview;

import java.util.Scanner;

public class SwapOfTwoVariable {
    public static void main(String[] args) {
//        int a=250, b=500;
//        System.out.println("Before Swap");
//        System.out.println("a="+a+"b="+b);
        Scanner scanner = new Scanner(System.in);
        int a;
        int b;
        System.out.println("Enter The Value To a: ");
        int num = scanner.nextInt();

        System.out.println("Enter The Value To b: ");
        int num1= scanner.nextInt();

        a = num;
        b=num1;

        a= a+b;
        b= a-b;
        a=a-b;

        System.out.println("...After The Swap...");
        System.out.print("a="+a+"b="+b);

        System.out.println("\nSwap Between Two Number");


    }
}
