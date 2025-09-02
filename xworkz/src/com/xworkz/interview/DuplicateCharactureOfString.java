package com.xworkz.interview;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharactureOfString {
    public static void main(String[] args) {
        String str = "Skanda M V Gowda";

        // Convert string to lowercase (optional for case-insensitive)
        str = str.toLowerCase();

        Map<Character, Integer> charCountMap = new HashMap<>();

        // Count frequency of each character to convert the string into char
        for (char c : str.toCharArray()) {
            if (c != ' ') {  // ignore spaces
                charCountMap.put(c, charCountMap.getOrDefault(c,0)+1);
            }
        }

        System.out.println("Duplicate characters in the string:");
        System.out.println(str);

        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet())
        {
            if (entry.getValue() > 1)
            {
                System.out.println(entry.getKey() + " = " + entry.getValue() + " times");
            }
        }
    }
}
