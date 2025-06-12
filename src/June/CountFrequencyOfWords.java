package June;

import java.util.HashMap;
import java.util.Map;

public class CountFrequencyOfWords {
    public static void main(String[] args){
        String str = "I am a test Automation Engineer test Java test Python and I am a Engineer";
        countFrequencyOfWord(str);
    }

    private static void countFrequencyOfWord(String str) {
        Map<String, Integer> data = new HashMap<>();
        for(String s : str.split("\\s+")){
            data.put(s, data.getOrDefault(s,0)+1);
        }



        for(Map.Entry<String, Integer> dataSet : data.entrySet()){
            System.out.println(dataSet.getKey()+" --> "+dataSet.getValue());

        }
    }
}
