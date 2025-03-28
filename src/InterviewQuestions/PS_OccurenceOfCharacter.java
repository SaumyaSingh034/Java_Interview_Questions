package InterviewQuestions;

import java.util.LinkedHashMap;
import java.util.Map;

public class PS_OccurenceOfCharacter {
    public static void main(String[] args){
        String str = "Saumya Singh";
        findOccurences(str);
    }

    private static void findOccurences(String str) {
        Map<Character, Integer> dataMap = new LinkedHashMap<>();
        for(char c : str.toCharArray()){
            dataMap.put(c, dataMap.getOrDefault(c,0)+1);
        }
        for(Map.Entry data : dataMap.entrySet()){
            System.out.println(data.getKey()+" ----> "+data.getValue());
        }

    }
}
