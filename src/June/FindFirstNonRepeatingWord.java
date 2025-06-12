package June;

import java.util.LinkedHashMap;
import java.util.Map;

public class FindFirstNonRepeatingWord {
    public static void main(String[] args){
        String str = "automation code is a generic code is generic automation";
        System.out.println(findFirstNonRepeatingWord(str));
    }

    private static String findFirstNonRepeatingWord(String str) {
        Map<String, Integer> data = new LinkedHashMap<>();
        for(String s : str.split("\\s+")) {
            data.put(s, data.getOrDefault(s, 0) + 1);
        }
        for(Map.Entry<String, Integer> dataSet : data.entrySet()){
            if(dataSet.getValue()==1){
                return dataSet.getKey();
            }
        }
        return " ";

    }
}
