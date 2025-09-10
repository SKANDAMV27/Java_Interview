package com.xworkz.interview;

public class ReverseTheWorld {
    public static void main(String[] args) {
        String input = "Java Programming Language";
        System.out.println("Original String: " + input);

        // Here we call the reverseWordsManual method
        String reversed = reverseWordsManual(input);

        System.out.println("Reversed Each Word: " + reversed);
    }

    public static String reverseWordsManual(String str) {
        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            for (int i = word.length() - 1; i >= 0; i--) {
                result.append(word.charAt(i));
            }
            result.append(" ");
        }

        return result.toString().trim();
    }
}
