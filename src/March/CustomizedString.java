package March;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class CustomizedString {
    public static void main(String[] args){
        String input = "Automation";
        customizedString(input);
    }

    private static void customizedString(String input) {
        StringBuffer result = new StringBuffer();
        Map<Character, Integer> data = new LinkedHashMap<>();
        for(char c : input.toLowerCase().toCharArray()){
            data.put(c, data.getOrDefault(c,0)+1);
        }

       for(char c : input.toLowerCase().toCharArray()){
           if(data.get(c) == 1){
               result.append(c);
           }else{
               result.append(data.get(c));
           }
       }
        System.out.print(result);


    }
}
