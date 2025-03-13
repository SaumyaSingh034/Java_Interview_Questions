package CodingChallenge_90Days;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstRepeatingCharacter {
    public static void main(String[] args){
        String str = "isswiw";
        System.out.println(findFirstRepeatingChar(str));

    }

    private static Character findFirstRepeatingChar(String str) {
        Map<Character, Integer> dataMap = new LinkedHashMap<>();
        for(char c : str.toCharArray()){
            dataMap.put(c, dataMap.getOrDefault(c, 0)+1);
        }

        for(Map.Entry<Character, Integer> dataSet : dataMap.entrySet()){
            if(dataSet.getValue() > 1){
                return dataSet.getKey();
            }
        }

        return ' ';
    }
}
