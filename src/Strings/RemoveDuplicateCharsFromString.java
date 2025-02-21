package Strings;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateCharsFromString {
    public static void main(String[] args){
        String str = "saumyasinghgh";
        removeDuplicate(str);
    }

    private static void removeDuplicate(String str) {
        Set<Character> unique = new LinkedHashSet<>();
        StringBuffer result = new StringBuffer();

        for(char c : str.toCharArray()){
            if(!Character.isWhitespace(c)){
                unique.add(c);
            }
        }

        for(char c : unique){
            result.append(c);
        }
       System.out.println( unique.toString());
       System.out.println( result.toString());
    }
}
