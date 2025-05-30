package May;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LongestSubstring001 {
    public static void main(String[] args){
        String str = "saumyasingh";
        String str1 = "aab";
        findLongestSubstring001(str);
    }

    private static void findLongestSubstring001(String str) {
        Set<Character> dataSet = new LinkedHashSet<>();
        int j=0, max = 0,start=0;
        for(int i = 0;i<str.length();i++){
            char ch = str.charAt(i);
            if(!dataSet.contains(ch)){
                dataSet.add(ch);
                max = Math.max(max, i-j+1);
                start = i-j+1;


            }else{
                dataSet.remove(j++);
            }
        }
        System.out.println(max);
        System.out.println(str.substring(j, max));
    }
}
