package Interviews;

import java.util.HashMap;
import java.util.Map;

public class PS_StringManipulation {
    public static void main(String[] args){
        String str = "Automation";
        manipulateString(str);
    }

    private static void manipulateString(String str) {
        StringBuilder result = new StringBuilder();
       Map<Character, Integer> dataMap = new HashMap<>();
       for(char c : str.toLowerCase().toCharArray()){
           dataMap.put(c, dataMap.getOrDefault(c,0)+1);
       }
       for(char c : str.toLowerCase().toCharArray()){
           if(dataMap.get(c)>1){
               result.append(dataMap.get(c));
           }else{
               result.append(c);
           }
       }
       System.out.println(result);
    }
}
