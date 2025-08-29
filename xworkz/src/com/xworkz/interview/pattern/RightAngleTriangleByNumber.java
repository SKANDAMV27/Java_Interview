package com.xworkz.interview.pattern;

public class RightAngleTriangleByNumber {
    public static void main(String[] args) {
        int j;
        int i;
        int row=10;

        for(i=0;i<=row;i++)
        {
            for(j=0;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();

        }
    }
}
