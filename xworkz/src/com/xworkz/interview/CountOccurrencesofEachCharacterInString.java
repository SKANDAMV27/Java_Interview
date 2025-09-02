package com.xworkz.interview;

import java.util.HashMap;
import java.util.Map;

public class CountOccurrencesofEachCharacterInString {
    public static void main(String[] args) {
        String name = "Skanda M V Thirthahalli Shivamogga";

        name=name.toLowerCase();

        Map<Character,Integer> countString = new HashMap<>();

        for(char c: name.toCharArray()){
            if(c!=' '){
                System.out.println(c+" Going to remove the Space");
                countString.put(c, countString.getOrDefault(c,0)+1);
//                System.out.print(c+" REmove the Space");
            }
        }
        System.out.println();
        System.out.println("Duplicate Characture in the give String "+name);
        for(Map.Entry<Character,Integer> entry : countString.entrySet()){
            if(entry.getValue()>0){
                System.out.println(entry.getKey()+"="+ entry.getValue());
            }
        }
    }
}
