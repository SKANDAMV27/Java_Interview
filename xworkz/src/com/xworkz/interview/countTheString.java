package com.xworkz.interview;

import java.util.Scanner;

public class countTheString {
    public static void main(String[] args) {

        System.out.println("Enter The String: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        String worlds[] = str.trim().split("\\s+");
        String length = String.valueOf(str.length());
        System.out.println("Number Of Worlds In the String: "+worlds.length);
        System.out.println("Total Number of Characture: "+length);
    }

}
