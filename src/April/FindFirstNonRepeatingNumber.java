package April;

import java.util.LinkedHashMap;
import java.util.Map;

public class FindFirstNonRepeatingNumber {
    public static void main(String[] args){
        String str = "automation";
        System.out.println(firstNonRepeatingCharacter(str));
    }

    private static Character firstNonRepeatingCharacter(String str) {
        Map<Character, Integer> hashMap = new LinkedHashMap<>();
        for(char c : str.toCharArray()){
            hashMap.put(c, hashMap.getOrDefault(c, 0)+1);
        }

        for(Map.Entry<Character, Integer> key : hashMap.entrySet()){
            if(key.getValue() == 1)
                return key.getKey();
        }
        return '_';
    }
}
