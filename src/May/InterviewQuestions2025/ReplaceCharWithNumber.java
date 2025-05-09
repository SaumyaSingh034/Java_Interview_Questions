package May.InterviewQuestions2025;

import java.util.HashMap;
import java.util.Map;

public class ReplaceCharWithNumber {
    public static void main(String[] args){
        String str = "Automation";
        replaceCharWithDigit(str);
    }

    private static void replaceCharWithDigit(String str) {
        char[] ch = str.toLowerCase().toCharArray();
        Map<Character, Integer> data = new HashMap<>();
        for(char c : ch){
            data.put(c, data.getOrDefault(c, 0)+1);
        }

        StringBuilder result = new StringBuilder();
        for(char c : ch){
            if(data.get(c)>1)
                result.append(data.get(c));
            else{
                result.append(c);
            }
        }
        System.out.println(result);
    }
}
