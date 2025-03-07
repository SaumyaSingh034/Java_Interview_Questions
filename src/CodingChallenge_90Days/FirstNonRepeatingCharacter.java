package CodingChallenge_90Days;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args){
        String str = "automationumin";
        System.out.println(findFirstNonRepeatingCharacter(str));

    }

    private static Character findFirstNonRepeatingCharacter(String str) {
        Map<Character, Integer> data = new LinkedHashMap<>();
        for(char c : str.toCharArray()){
            data.put(c, data.getOrDefault(c,0)+1);
        }
        int min = Integer.MAX_VALUE;


        for(Map.Entry<Character, Integer> key : data.entrySet()){
            if(key.getValue() == 1){
                return key.getKey();
            }
        }
        return '_';
    }
}
