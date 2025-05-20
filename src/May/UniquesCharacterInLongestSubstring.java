package May;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class UniquesCharacterInLongestSubstring {
    public static void main(String[] args){
        String str = "abcabcbb";
        validLongestUniqueSubstring(str);
        anotherApproach(str);
    }

    private static void anotherApproach(String str) {
        Set<Character> data = new HashSet<>();
        int start = 0;
        int maxLen = 0;
        int maxStart = 0;
        int end = 0;

       for(int i=0;i<str.length();i++){
           while(data.contains(str.charAt(i))){
               data.remove(str.charAt(start++));
           }
           data.add(str.charAt(i));
           if(i-start+1>maxLen){
               maxLen = i-start+1;
               maxStart = start;
           }
       }
       System.out.println(str.substring(maxStart, maxStart+maxLen));
    }

    private static void validLongestUniqueSubstring(String str) {
        int maxLength = 0;
        StringBuilder result = new StringBuilder();
        Set<Character> data = new LinkedHashSet<>();

        for(char c : str.toCharArray()){
            if(data.add(c)){
                result.append(c);
            }
        }
        maxLength = data.size();
        System.out.println(result+" --> "+maxLength);
    }
}
