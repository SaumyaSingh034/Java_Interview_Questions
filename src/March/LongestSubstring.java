package March;

import java.util.HashSet;

public class LongestSubstring {
    public static void main(String[] args){
        String str = "abcabcbb";
        System.out.println("Longest Unique Substring Length: " + longestUniqueSubsttr(str));
    }

    private static int longestUniqueSubsttr(String str) {
        int maxLength = 0;
        int left = 0;
        HashSet<Character> set = new HashSet<>();

        for(int right=0;right<str.length();right++){
            while(set.contains(str.charAt(right))){
                set.remove(str.charAt(left));
                left++;
            }
            set.add(str.charAt(right));
            maxLength = Math.max(maxLength, right-left+1);
        }
        return maxLength;
    }
}
