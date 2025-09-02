package com.xworkz.interview;

import java.util.Scanner;

public class HarshedNumber {
    public static void main(String[] args) {
        System.out.println("Enter The Harshed Number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
//        int num = 45;
        int sum =0;
        int temp = num;

        while(temp>0){
            sum += temp%10;
            temp/=10;
        }
        if(num%sum == 0){
            System.out.println("This is "+num+" Harshed Numbe");
        }
        else {
            System.out.println("This Is Not Harshed Number: "+num);
        }
    }
}
