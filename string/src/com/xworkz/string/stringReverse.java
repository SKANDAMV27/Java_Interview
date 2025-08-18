package com.xworkz.string;

public class stringReverse {
    public static void main(String[] args) {
        String str = "HELLO";
        System.out.println("Before The Reverse: "+str);
        char[] ch = str.toCharArray();  // To convert the String Into Array

        int start = 0;
        int end = ch.length-1;


        while (start<end){                  //This is Used To Swap The char
            char temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;

            start++;
            end--;
        }

        String reverse = new String(ch);

        System.out.println("String Reversed: "+reverse);


    }
}
