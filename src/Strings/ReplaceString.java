package Strings;

import java.util.LinkedHashMap;
import java.util.Map;

public class ReplaceString {
    public static void main(String[] args){
        String str = "Automationa";
        String str1 = "saumyaSSSS";
        replaceString(str1);
    }

    private static void replaceString(String str) {
        Map<Character, Integer> dataMap = new LinkedHashMap<>();
        for(char c : str.toLowerCase().toCharArray()){
            dataMap.put(c, dataMap.getOrDefault(c,0)+1);
        }
        StringBuilder result = new StringBuilder();
        for(char c : str.toLowerCase().toCharArray()){
            if(dataMap.get(c)==1){
                result.append(c);
            }else{
                result.append(dataMap.get(c));
            }
        }
        System.out.println(result.toString());
    }
}
