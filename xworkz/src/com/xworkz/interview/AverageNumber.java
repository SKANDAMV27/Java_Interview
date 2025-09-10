package com.xworkz.interview;

import java.util.Scanner;

public class AverageNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The Number Of Element: ");
        int n = scanner.nextInt();
        int sum = 0;

        for(int i=0;i<=n;i++){
            System.out.println("Num"+i+"");
            sum+= scanner.nextInt();
        }
           double average =(double) sum/n;

        System.out.println(average);

    }
}
