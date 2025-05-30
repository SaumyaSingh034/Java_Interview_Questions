package May;

import java.util.HashSet;
import java.util.Set;

public class Question1 {
    public static void main(String[] args){
        String str = "saumyasingh";
        //findUniqueLongestSubstring
        longestUniqueSubstringNonRepeated(str);
    }

    private static void longestUniqueSubstringNonRepeated(String str) {
        int left = 0, max = 0;
        Set<Character> resultSet = new HashSet<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(!resultSet.contains(ch)){
                resultSet.add(ch);
                max = Math.max(i-left+1, max);
            }
            else{
                resultSet.remove(left++);
            }
        }
        System.out.println(max);
        System.out.println(str.substring(left,max));
    }
}
