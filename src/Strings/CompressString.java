package Strings;

import java.util.HashMap;
import java.util.Map;

public class CompressString {
    public static void main(String[] args){
        String str = "aaabbccca";
        compressString(str);
    }

    private static void compressString(String str) {
        Map<Character, Integer> data = new HashMap<>();
        for(char c : str.toCharArray()){
            data.put(c, data.getOrDefault(c,0)+1);
        }
        StringBuffer result = new StringBuffer();

        for(Map.Entry keyset : data.entrySet()){
           result.append(keyset.getValue()).append(keyset.getKey());
        }
        System.out.println(result);

    }
}
