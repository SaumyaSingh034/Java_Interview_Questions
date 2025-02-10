package February2025;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class RemoveDuplicateChar {
    public static void main(String[] atgs){
        String str = "saumyas";
        removeDuplicateCharacter(str);
    }

    private static void removeDuplicateCharacter(String str) {
       Map<Character, Integer> hashMap = new LinkedHashMap<>();

       for(char c : str.toCharArray()){
           hashMap.put(c, hashMap.getOrDefault(c, 0)+1);
       }

       StringBuffer result = new StringBuffer();
       for(Map.Entry<Character, Integer> data : hashMap.entrySet()){
           if(data.getValue() == 1){
               result.append(data.getKey());
           }
       }
       System.out.println(result.toString());
    }
}
