package com.xworkz.string;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("............Even Or Odd...........");
        System.out.println("Enter The Number:");
          int num = scanner.nextInt();

//        int num = 45;

        if(num%2==0)//% is the modulus operator, which gives the remainder.if the modules is 0 then even
        {
            System.out.println(num+":Even........");
        }else
        {
            System.out.println(num+" Odd Number");
        }
    }
}
