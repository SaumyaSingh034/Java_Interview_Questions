package May.basicString;

import java.util.HashMap;
import java.util.Map;

public class LongestValidStringCharacter3 {
    public static void main(String[] args){
        String str = "aaabbbcccddddeeee";
        validLongestSubstring(str);
    }

    private static void validLongestSubstring(String str) {
        int maxLength = 0;
        int j = 0;
        int maxStart = 0;
        Map<Character, Integer> dataMap = new HashMap<>();

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i); //a
            dataMap.put(ch, dataMap.getOrDefault(ch,0)+1); //a-->4
            while(dataMap.get(ch) > 3){
                char c = str.charAt(j);
                dataMap.put(c, dataMap.get(c)-1);
                j++;
            }

            if(i-j+1>maxLength){
                maxLength = i-j+1;
                maxStart = j;
            }

        }
        System.out.println(maxLength);
        System.out.println(str.substring(maxStart, maxStart+maxLength));
        System.out.println(dataMap);

    }
}
