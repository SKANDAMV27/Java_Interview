package com.xworkz.string;

public class SwapOfTwoVariable {
    public static void main(String[] args) {
        int a=250, b=500;
        System.out.println("Before Swap");
        System.out.println("a="+a+"b="+b);

        a= a+b;
        b= a-b;
        a=a-b;

        System.out.println("...After The Swap...");
        System.out.print("a="+a+"b="+b);

        System.out.println("\nSwap Between Two Number");


    }
}
