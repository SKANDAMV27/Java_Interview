package com.xworkz.interview;

import java.util.Scanner;

public class reverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The Number To Reverse: ");
        long num= scanner.nextLong();

        long temp = num;
        long reverse = 0;

        while (temp>0){
            reverse = reverse*10+temp%10; //build the reverse number
            temp/=10;//remove the last digits
        }
        System.out.println("After The Reverse: "+reverse);


    }
}
