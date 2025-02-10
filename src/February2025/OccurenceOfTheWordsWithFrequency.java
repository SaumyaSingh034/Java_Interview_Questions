package February2025;

import java.util.LinkedHashMap;
import java.util.Map;

public class OccurenceOfTheWordsWithFrequency {

    public static void main(String[] args){
        String str = "payal shirish mehta payal";
        countOccurenceOfWord(str);
    }

    private static void countOccurenceOfWord(String str) {
        Map<String, Integer> resultMap = new LinkedHashMap<>();
        for(String s : str.split("\\s+")){
            resultMap.put(s, resultMap.getOrDefault(s, 0)+1);
        }

        System.out.println(resultMap);

        for(Map.Entry<String, Integer> entry : resultMap.entrySet()){
            System.out.println(entry.getKey()+" --> "+entry.getValue());
        }
    }
}
