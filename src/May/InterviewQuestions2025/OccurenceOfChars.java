package May.InterviewQuestions2025;

import java.util.LinkedHashMap;
import java.util.Map;

public class OccurenceOfChars {
    public static void main(String[] args){
        String str = "Saumya Singh";
        countChars(str);
    }

    private static void countChars(String str) {
        Map<Character, Integer> data = new LinkedHashMap<>();
        for(char c : str.toCharArray()){
            data.put(c, data.getOrDefault(c,0)+1);
        }

        for(Map.Entry datSet : data.entrySet()){
            System.out.println(datSet.getKey()+"--->"+datSet.getValue());
        }
    }
}
