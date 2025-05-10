package May.InterviewQuestions2025;

import java.util.LinkedHashMap;
import java.util.Map;

public class PS_02 {
    public static void main(String[] args){
        String str = "aabbbccccd";
        customizeStringWithDigit(str);
    }

    private static void customizeStringWithDigit(String str) {
        Map<Character, Integer> data = new LinkedHashMap<>();
        StringBuilder result = new StringBuilder();
        for(char c : str.toCharArray()){
            data.put(c, data.getOrDefault(c,0)+1);
        }

        for(Map.Entry<Character, Integer> dataSet : data.entrySet()){
               result.append(dataSet.getKey()).append(dataSet.getValue());

        }
        System.out.println(result);
    }
}
