package com.xworkz.interview;

import java.util.Scanner;

public class SmallestLargestDigits {
    public static void main(String[] args) {
        System.out.println("Enter The Number: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int smallest = 9;
        int largest = 0;
        int temp = num;

        while(temp>0){
            int digits = temp%10;
            if(digits>largest)largest = digits;
            if(digits<smallest)smallest = digits;
            temp/=10;
        }
        System.out.println("Largest Digits: "+largest);
        System.out.println("Smallest Digits: "+smallest);

    }

}
