package test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Test5 {
    public static void main(String[] args){
        String str = "saumya23456&*^yu2";
        String str1 = "saumyasingh";
        longestSubstringUnique(str1);
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
       Set<Character> dataSet = new HashSet<>();
       int maxLength = 0;
       int start = 0;
       int end = 0;
       int maxStart = 0;
       while(end<str.length()){
           char ch = str.charAt(end);
           if(!dataSet.contains(ch)) {
               dataSet.add(ch);
               end++;
               if (end - start > maxLength) {
                   maxLength = end - start;
                   maxStart = start;
               }
           }else{
                   dataSet.remove(str.charAt(start));
                   start++;
               }
           }



        System.out.println(str.substring(maxStart, maxStart+maxLength));

    }
}
