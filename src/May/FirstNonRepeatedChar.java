package May;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatedChar {
    public static void main(String[] args){
        String s = "saumyasingh";
        System.out.println(findNonRepeatedChar(s));
    }

    private static Character findNonRepeatedChar(String s) {
        Map<Character, Integer> hashMap = new LinkedHashMap<>();
        for(char c : s.toCharArray()){
            hashMap.put(c, hashMap.getOrDefault(c,0)+1);
        }
        for(Map.Entry<Character, Integer> data : hashMap.entrySet()){
            if(data.getValue() == 1)
                return data.getKey();
        }
        return '_';
    }
}
