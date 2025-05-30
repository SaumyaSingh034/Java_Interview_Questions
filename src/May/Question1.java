package May;

import java.util.HashSet;
import java.util.Set;

public class Question1 {
    public static void main(String[] args){
        String str = "saumyasingh"; //umyasingh
        //findUniqueLongestSubstring
        longestUniqueSubstringNonRepeated(str);
        longestUniqueSubstringNonRepeated1(str);
    }

    private static void longestUniqueSubstringNonRepeated1(String str) {
        int maxLenth = 0;
        int left = 0;
        Set<Character> data = new HashSet<>();
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if(!data.contains(c)){
                data.add(c);
                maxLenth = Math.max(i-left+1, maxLenth);
            }else{
                data.remove(left++);
            }

        }
        System.out.println(maxLenth);
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
