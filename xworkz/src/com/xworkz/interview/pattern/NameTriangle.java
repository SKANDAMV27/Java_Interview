package com.xworkz.interview.pattern;

public class NameTriangle {
    public static void main(String[] args) {
        int i;
        int j;
        String str ="Skanda M V";

        for(i=0;i<str.length();i++){
            for(j=0;j<=i;j++){
                System.out.print(str.charAt(j)+" ");
            }
            System.out.println();
        }
    }
}
