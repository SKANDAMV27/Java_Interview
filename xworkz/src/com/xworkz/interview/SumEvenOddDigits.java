package com.xworkz.interview;

import java.util.Scanner;

public class SumEvenOddDigits {
    public static void main(String[] args) {
        System.out.println("Enter The Number: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        int even = 0;
        int odd = 0;

        int temp = num;

        while(temp>0){
            int sum = temp%10;
            if(sum%2==0){
                even +=sum;
            }
            else{
                odd +=sum;
            }
            temp/=10;
        }

        System.out.println("Even Number: "+even);
        System.out.println("Odd Number: "+odd);
    }
}
