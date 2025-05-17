package May;

import java.util.HashSet;

public class LongestSubstring {
    public static  void main(String[] args){
        String str = "aab";
        longestSubstring(str);
        longestRepeatingSubstring(str);
    }

    private static void longestRepeatingSubstring(String str) {
        String longest = "";
        for(int i=0;i<str.length();i++){
            for(int j=i;j<str.length();j++){
                String sub = str.substring(i,j);
                if(str.indexOf(sub, j) != -1){
                    longest = sub;
                }
            }
        }
        System.out.println(longest+" Longest ");
    }

    private static void longestSubstring(String str) {
        int maxLength = 0;
        int left = 0;
        HashSet<Character> set = new HashSet<>();
        for(int i=0;i<str.length();i++){
            while(set.contains(str.charAt(i))){
                set.remove(str.charAt(left));
                left++;
            }
            set.add(str.charAt(i));
            maxLength = Math.max(maxLength, i-left+1);
        }
        System.out.println(maxLength);
    }
}
