package com.xworkz.interview.pattern;

public class FiveStar {
    public static void main(String[] args) {
        int i;
        int j;
        for(i=1;i<=5;i++) //This is for row
        {
            for(j=1;j<=5;j++) //This is for column
            {
                System.out.print("*"); //print the Star
            }
            System.out.println(); // move to next line after the row
        }
    }
}
