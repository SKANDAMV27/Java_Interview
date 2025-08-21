package com.xworkz.string;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args)//Enter Point of code
    {
        Scanner scanner = new Scanner(System.in); //Create an object
        System.out.println("Enter The Number To Check Prime or Not:"); // user to enter the number
        int num = scanner.nextInt(); // read the number entered by user

        boolean isPrime = true; // if given number is true

        if(num<=1)//then check if number is more then or equal
        {
            isPrime = false; //if the number is more  then1 then it is not a prime number
        }
        for(int i=2;i<=num/2;i++)// loop is start with 2 and check num/2

        {
            if(num%i==0)//if number is div by i
            {
                isPrime=false; //then also not prime
                break; //end the LooP
            }
        }

        if(isPrime) //print the result based on he isPrime flag
        {
            System.out.println(num+" :Is Prime");
        }
        else {
            System.out.println(num+" :Is not a Prime");
        }
    }
}
