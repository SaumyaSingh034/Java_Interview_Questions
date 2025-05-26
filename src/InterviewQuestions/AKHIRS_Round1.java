package InterviewQuestions;

import java.util.HashSet;
import java.util.Set;

public class AKHIRS_Round1 {
    public static void main(String[] args){
        String str = "saumyasingh";
        findUniqueLongestSubstring(str);
    }

    private static void findUniqueLongestSubstring(String str) {
        int maxLength = 0, start = 0, end = 0, maxStart = 0;
        Set<Character> set = new HashSet<>();

        while(end < str.length()){
            char ch = str.charAt(end);
            if(!set.contains(ch)){
                set.add(ch);
                end++;
                if(end-start > maxLength){
                    maxLength = end-start;
                    maxStart = start;
                }

            }else{
                set.remove(str.charAt(start));
                start++;

            }
        }
        System.out.println(str.substring(maxStart, maxStart+maxLength));
    }
}
