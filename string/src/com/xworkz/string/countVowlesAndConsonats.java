package com.xworkz.string;

import java.util.Locale;

public class countVowlesAndConsonats {
    public static void main(String[] args) {
            String str = "I Love Java To Much";
            str = str.toLowerCase();

            int vowles = 0, consonant = 0;

            for(int i=0;i<str.length();i++){
                char ch = str.charAt(i);
                if(ch>='a' && ch<='z'){
                    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowles++;
                    }else {
                        consonant++;
                    }
                }
            }
            String[] world = str.trim().split("");
            int worldCount = world.length;
        System.out.println("Vowles: "+vowles);
        System.out.println("Consonant: "+consonant);
        System.out.println("Total: "+worldCount );

    }

}
