package March;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args){
        String input = "aabbccdeeffg"; //d
        System.out.println(firstNonRepeatingCharacter(input));
    }

    private static Character firstNonRepeatingCharacter(String input) {
        Map<Character, Integer> dataMap = new LinkedHashMap<>();
        for(char c : input.toCharArray()){
            dataMap.put(c, dataMap.getOrDefault(c,0)+1);
        }
        for(Map.Entry<Character, Integer> dataEntry : dataMap.entrySet()){
            if(dataEntry.getValue() == 1){
                return dataEntry.getKey();
               // break;
            }
        }
        return '_';
    }
}
