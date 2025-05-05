package May.basicString;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class NonRepeatingCharacter {
    public static void main(String[] args){
        String str = "automationu";
        System.out.println(findFirsNonRepeatingChar(str));
    }

    private static Character findFirsNonRepeatingChar(String str) {
        Map<Character, Integer> hmData = new LinkedHashMap<>();
        for(char c : str.toCharArray()){
            hmData.put(c, hmData.getOrDefault(c,0)+1);
        }

        for(Map.Entry<Character, Integer> hm : hmData.entrySet()){
            if(hm.getValue()==1)
                return hm.getKey();
        }
        return '_';
    }
}
