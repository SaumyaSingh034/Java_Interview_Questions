package March;

import java.util.HashMap;
import java.util.Map;

public class OptimisedFrequentCharacterString {
    public static void main(String[] args){
        String str = "hello";
        System.out.println( mostFrequentCharacterString(str));
    }

    private static char mostFrequentCharacterString(String str) {
        Map<Character, Integer> freqMap = new HashMap<>();
        char maxChar = ' ';
        int maxCount = 0;
        for (char ch : str.toCharArray()) {
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
            if (freqMap.get(ch) > maxCount) {
                maxCount = freqMap.get(ch);
                maxChar = ch;
            }
        }
        return maxChar;
    }

    }
