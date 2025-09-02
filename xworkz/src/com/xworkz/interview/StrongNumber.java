package com.xworkz.interview;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        System.out.println("Enter The Number: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        int sum = 0;

        int temp = num;

        while(temp>0){
            int digits = temp%10;
            sum += factorial(digits);
            temp /= 10;
        }
        if(sum==num){
            System.out.println(num+":This is Strong Number");
        }
        else {
            System.out.println("This Is Not String Number:"+num);
        }

    }
    static int factorial(int n){
        int fact =1;
        for(int i=1;i<=n;i++)
            fact *=i;
        return fact;
    }
}
