package com.xworkz.interview;

import java.util.Scanner;

public class palindrom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The Number: ");
        int num = scanner.nextInt();

        int temp = num; // convert temp to num
        int reverse = 0; //

        while (temp>0)
        {
            reverse = reverse*10+temp%10; //build the reverse number
            temp/=10; //remove last digits
        }
        if(num==reverse) // if number is equal to reverse
        {
            System.out.println(num+"This Is Palindram");
        }
        else{
            System.out.println(num+":This Is not a Palindrom");
        }
    }
}
