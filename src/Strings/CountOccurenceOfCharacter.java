package Strings;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountOccurenceOfCharacter {
    public static void main(String[] args){
        String str = "ilovetocodeinjava";
        countOccurenceOfCharacter(str);
    }

    private static void countOccurenceOfCharacter(String str) {
        Map<Character, Integer> data = new LinkedHashMap<>();
        for(char c : str.toCharArray()){
            data.put(c, data.getOrDefault(c,0)+1);
        }

        System.out.println(data);
    }
}
