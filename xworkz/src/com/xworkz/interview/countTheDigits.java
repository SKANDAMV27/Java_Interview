package com.xworkz.interview;

import com.sun.javafx.css.Size;

import java.util.Scanner;

public class countTheDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The Number's To Count: ");
        long num = scanner.nextLong();

        long sum = 0; //sum from 0

        long temp = num;// then convert number to temp

        while (temp>0)//loop until temp become 0
        {
            sum+= temp%10; // Take Last Digits and all it to sum
            temp/=10; // Remove The Last digits
        }

        System.out.println("Then"+num+":"+sum);
    }

}
