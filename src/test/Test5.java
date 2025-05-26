package test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Test5 {
    public static void main(String[] args){
        String str = "saumya23456&*^yu2";
        //longestSubstringUnique(str);
        fetchNumberAndSum(str);
    }

    private static void fetchNumberAndSum(String str) {
        int sum = 0;
        int digit = 0;
        for(char c : str.toCharArray()){
            if(Character.isDigit(c)){
                digit = Character.getNumericValue(c);
                sum += digit;
            }
        }
        System.out.println(sum);
    }

    private static void longestSubstringUnique(String str) {
       Map<Character, Integer> data = new HashMap<>();

    }
}
