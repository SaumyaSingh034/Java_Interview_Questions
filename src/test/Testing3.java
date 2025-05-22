package test;

import java.util.HashMap;
import java.util.Map;

public class Testing3 {
    public static void main(String[] args){
        String str = "philadelphia is a place ";
        printOnLyVowels(str);
    }

    private static void printOnLyVowels(String str) {
        str = str.replaceAll(" ","");
        Map<Character, Integer> data = new HashMap<>();

        for(char c : str.toCharArray()){
            data.put(c, data.getOrDefault(c, 0)+1);
        }

        for(Map.Entry<Character, Integer> hm : data.entrySet()){
            if(hm.getKey() == 'a' || hm.getKey() == 'e' ||
            hm.getKey() =='i' || hm.getKey() == 'o' || hm.getKey() == 'u'){
                System.out.println(hm.getKey()+ " ----> "+hm.getValue());
            }
        }
    }
}
