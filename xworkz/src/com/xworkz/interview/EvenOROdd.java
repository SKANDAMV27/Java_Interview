package com.xworkz.interview;

import java.util.Scanner;

public class EvenOROdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter The Number To Check Even Or Odd: ");

        int num = sc.nextInt();

        if(num%2 ==0)//if number is divided be 2
        {
            System.out.println(num+":Number is Even Number"); // then number is even
        }else {
            System.out.println(num+": odd Number");//number s odd
        }
    }
}
