package com.xworkz.interview;

import java.util.Scanner;

public class EvenOROdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println("Enter The Number To Check Even Or Odd: ");

        if(num%2 ==0){
            System.out.println(num+":Number is Even Number");
        }else {
            System.out.println(num+": odd Number");
        }
    }
}
