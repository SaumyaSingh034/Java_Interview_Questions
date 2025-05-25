package CodingChallenge;

import java.util.HashMap;
import java.util.Map;

public class MaxRepeatedWord {
    public static void main(String[] args){
        String str = "This is a test.This test is only a test";
        str = str.replaceAll("[^a-zA-Z0-9\\s]"," ");
        System.out.println(str);
        findMaxRepeatedWord(str);
    }

    private static void findMaxRepeatedWord(String str) {
        Map<String, Integer> hashMap = new HashMap<>();
        for(String s : str.split("\\s+")){
            hashMap.put(s, hashMap.getOrDefault(s,0)+1);
        }
        int maxValue = Integer.MIN_VALUE;
        for(int i : hashMap.values()){
            if(maxValue < i)
                maxValue = i;
        }
        for(Map.Entry<String, Integer> data : hashMap.entrySet()){
            if(maxValue == data.getValue())
                System.out.println(data.getKey());
        }
    }
}
