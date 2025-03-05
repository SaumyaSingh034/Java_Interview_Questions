package Strings;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class CountWordOccurence {
    public static void main(String[] args){
        String str = "my name is Rohan Rohan";
        countWord(str);
    }

    private static void countWord(String str) {
        Map<String, Integer> data = new LinkedHashMap<>();
        for(String s : str.split("\\s")){
            data.put(s, data.getOrDefault(s, 0)+1);
        }
        System.out.println(data);
    }
}
