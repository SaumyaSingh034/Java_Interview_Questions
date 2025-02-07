package February2025;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class CountOccurenceOfChar {

    public static void main(String[] args){
        String str = "Ilovejavacoding";
        countCharOccurence(str);
    }

    private static void countCharOccurence(String str) {
        Map<Character, Integer> dataMap = new LinkedHashMap<>();
        for(char c : str.toCharArray()){
            dataMap.put(c, dataMap.getOrDefault(c, 0)+1);
        }
        System.out.println(dataMap);

    }
}
