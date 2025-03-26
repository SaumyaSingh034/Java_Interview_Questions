package March;

import java.util.HashMap;
import java.util.Map;

public class MostFrequentCharacterString {
    public static void main(String[] args){
        String str = "hello";
       System.out.println( mostFrequentCharacterString(str));
    }

    private static Character mostFrequentCharacterString(String str) {
        Map<Character, Integer> dataMap = new HashMap<>();
        char maxChar = ' ';
        int maxValue = Integer.MIN_VALUE;
        for(char c : str.toCharArray()){
            dataMap.put(c, dataMap.getOrDefault(c, 0)+1);
            if(dataMap.get(c)>maxValue){
                maxValue = dataMap.get(c);
                maxChar = c;
            }
        }
        return maxChar;


}}
