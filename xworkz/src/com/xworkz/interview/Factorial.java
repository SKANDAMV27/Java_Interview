package com.xworkz.interview;

import java.util.Scanner;

import static com.xworkz.interview.StrongNumber.factorial;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Enter The Number: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        int factorial = 1;

        for(int i=1;i<=num;i++){
            factorial *=i;
        }
        System.out.println("Factorial Number: "+factorial);
        System.out.println(factorial);


    }

}
