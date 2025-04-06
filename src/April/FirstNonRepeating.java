package April;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeating {
    public static void main(String[] args){
        String str = "mississippi";
        System.out.println(firstNonRepeatingChar(str));
    }

    private static Character firstNonRepeatingChar(String str) {
        Map<Character, Integer> hashMap = new LinkedHashMap<>();
        for(char c : str.toCharArray()){
            hashMap.put(c, hashMap.getOrDefault(c, 0)+1);
        }

        for(Map.Entry<Character, Integer> data : hashMap.entrySet()){
            if(data.getValue() == 1)
                return data.getKey();
        }
        return '_';
    }
}
