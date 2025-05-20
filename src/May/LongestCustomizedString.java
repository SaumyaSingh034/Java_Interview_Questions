package May;

import java.util.HashMap;
import java.util.Map;

public class LongestCustomizedString {
    public static void main(String[] args){
        String str = "aaabbbcccddddeeeeee";
        longestValidSubstring(str);

    }

    private static void longestValidSubstring(String str) {
        Map<Character, Integer> dataMap = new HashMap<>();
        int start = 0;
        int maxLength = 0;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            dataMap.put(ch, dataMap.getOrDefault(ch, 0)+1);
            while(dataMap.get(ch) > 3){
                char leftChar = str.charAt(start);
                dataMap.put(leftChar,dataMap.get(leftChar)-1);
                start++;
            }
            maxLength = Math.max(maxLength, i-start+1);
        }
        System.out.println(maxLength);
        System.out.println(dataMap);
    }
}
