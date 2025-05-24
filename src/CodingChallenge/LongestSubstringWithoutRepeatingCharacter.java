package CodingChallenge;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacter {
    public static void main(String[] args) {
        String str = "geeksforgeeks";
        longestUniqueSubstring(str);
    }

    public static void longestUniqueSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int start = 0, end = 0;
        int maxLen = 0, maxStart = 0;

        while (end < s.length()) {
            char ch = s.charAt(end);
            if (!set.contains(ch)) {
                set.add(ch);
                end++;
                if (end - start > maxLen) {
                    maxLen = end - start;
                    maxStart = start;
                }
            } else {
                set.remove(s.charAt(start));
                start++;
            }
        }
        System.out.println(s.substring(maxStart, maxStart + maxLen));
    }
}
