package com.xworkz.swap;

public class Swap {
    public static void main(String[] args) {
        int a=723, b=890;

        System.out.println("Before Swap: "+"a="+a+" b="+b);

        a= a+b;             // swap
        b= a-b;
        a= a-b;

        System.out.println("After The Swap: "+"a="+a+" b="+b);

        System.out.println("Swap Become Done");
    }
}
