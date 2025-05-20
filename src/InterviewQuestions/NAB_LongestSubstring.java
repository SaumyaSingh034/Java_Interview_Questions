package InterviewQuestions;

import java.util.HashMap;
import java.util.Map;

public class NAB_LongestSubstring {
    public static void main(String[] args){
        String str = "baaabbabbb"; //7
        nam_LongestValidSubstring(str);
    }

    private static void nam_LongestValidSubstring(String str) {
        int maxLength = 0;
        int start = 0;
        Map<Character, Integer> dataMap = new HashMap<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i); //b
            dataMap.put(ch, dataMap.getOrDefault(ch,0)+1); //b-3 a-4
            while(dataMap.get(ch) > 3){
                char leftChar = str.charAt(start);
                dataMap.put(leftChar, dataMap.get(leftChar)-1);
                start++;
            }

            if(i-start+1 > maxLength){
                maxLength = i-start+1;
            }

        }
        System.out.println(maxLength);
    }
}
