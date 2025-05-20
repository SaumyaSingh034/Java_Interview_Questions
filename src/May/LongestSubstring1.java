package May;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstring1 {
    public static void main(String[] args){
        String str = "aaabbbcccddddeeeeee";
        longestValidSubstring1(str);
        longestSubstring2(str);
    }

    private static void longestSubstring2(String str) {
        int maxLength = 0;
        int start = 0;
        int maxStart = 0;
        Map<Character, Integer> data = new HashMap<>();
        for (int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            data.put(ch, data.getOrDefault(ch, 0)+1);

            while(data.get(ch)>3){
                char leftChar = str.charAt(start);
                data.put(leftChar, data.get(leftChar)-1);
                start++;
            }
            if(i-start+1 > maxLength){
                maxLength = i-start+1;
                maxStart = start;
            }

        }
        System.out.println(str.substring(maxStart, maxLength)+" --> "+maxLength+" --> maxStart"+maxStart);

    }

    private static void longestValidSubstring1(String str) {
        int maxLength = 0;
        int start = 0;
        int maxStart = 0;
        Map<Character, Integer> data = new HashMap<>();

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            data.put(ch, data.getOrDefault(ch, 0)+1);
            while(data.get(ch) > 3){
                char leftChar = str.charAt(start);
                data.put(leftChar, data.get(leftChar)-1);
                start++;
            }

            if(i-start+1>maxLength){
                maxLength = i-start+1;
                maxStart = start;
            }
        }
        System.out.println(str.substring(maxStart, maxStart+maxLength));

    }
}
