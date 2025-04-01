package April;

import java.util.LinkedHashMap;
import java.util.Map;

public class StringManipulation {
    public static void main(String[] args){
        String str = "Automation";
        stringManipulationUsingHashMap(str);
    }

    private static void stringManipulationUsingHashMap(String str) {
        StringBuilder result = new StringBuilder();
        Map<Character, Integer> dataMap = new LinkedHashMap<>();
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
