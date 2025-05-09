package May;

import java.util.HashMap;
import java.util.Map;

public class CountDuplicateWord {
    public static void main(String[] args){
        String str = "Java is good programming language . Pytho is best programming language";
        countwords(str);
    }

    private static void countwords(String str) {
        Map<String, Integer> words = new HashMap<>();
        for(String s : str.split("\\s+")){
            words.put(s, words.getOrDefault(s,0)+1);
        }


        for(Map.Entry<String, Integer> dataSet : words.entrySet()){
            if(dataSet.getValue() > 1){
                System.out.println(dataSet.getKey()+ " ---> "+dataSet.getValue());
            }
        }
    }
}
