package test;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class Test7 {
    public static void main(String[] args){
        String str = "My Name is Shefali Singh";
        removeDuplicatesFromString01(str);
    }

    private static void removeDuplicatesFromString01(String str) {
       Map<Character, Integer> dataMap = new LinkedHashMap<>();
        StringBuilder result = new StringBuilder();
        str = str.replaceAll(" ", "");
        for( char c : str.toLowerCase().toCharArray()){
            dataMap.put(c, dataMap.getOrDefault(c, 0)+1);
        }

        for(Map.Entry<Character, Integer> data : dataMap.entrySet()){
            if(data.getValue() == 1)
                result.append(data.getKey());
        }
        System.out.println(result.toString());
    }
}
