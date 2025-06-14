package June;

import java.util.LinkedHashMap;
import java.util.Map;

public class CompressString {
    public static void main(String[] args){
        String str = "aaabbbbccdd";
        //o/p --> a3b4c2d2

        compressString11(str);

    }

    private static void compressString11(String str) {
        Map<Character, Integer> data = new LinkedHashMap<>();
        StringBuilder result = new StringBuilder();

        for(char c : str.toCharArray()){
            data.put(c, data.getOrDefault(c,0)+1);
        }

        for(Map.Entry<Character, Integer> dataSet : data.entrySet()){
            result.append(dataSet.getKey()).append(dataSet.getValue());
        }

        System.out.println(result.toString());
    }
}
