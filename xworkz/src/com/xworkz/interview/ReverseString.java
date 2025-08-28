package com.xworkz.interview;

public class ReverseString {
    public static void main(String[] args) {
        String input ="My Name Is Skanda M V"; //
        String reverse = "";
        System.out.println("Before The Reveres: "+input);

        for(int i=input.length()-1;i>=0;i--) // in the loop input.length()(This is used to calculate the Number of characture in the String) input.length()-1 it start from the last
        {
            reverse = reverse + input.charAt(i); // in this input.charAt(i) (it picks the single characture from the position i) and add both position and result

        }
        System.out.println("After The Reverse: "+reverse);

    }
}
