package com.xworkz.interview.pattern;

public class ReversePyramid {
    public static void main(String[] args) {
        int i;
        int j;
        int z;

        for(i=5;i>=1;i--){
            for(j=1;j<=5;j++){
                System.out.print("");
            }
            for(z=1;z<=(2*i-1);z++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
