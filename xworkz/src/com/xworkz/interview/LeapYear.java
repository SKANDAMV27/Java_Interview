package com.xworkz.interview;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The Year: ");
        int year = scanner.nextInt();

        if((year%4==0 && year%100!=0)||(year%400==0)) // leap Year come at the Four years once
        {
            System.out.println(year+" :Leap Year");
        }
            else{
            System.out.println(year+":Not a Leap Year");
            }

        }
    }

