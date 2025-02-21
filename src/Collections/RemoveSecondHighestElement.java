package Collections;

import java.util.HashMap;
import java.util.Map;

public class RemoveSecondHighestElement {
    public static void main(String[] args){
        Map<String, Integer> data = new HashMap<>();
        data.put("Virat", 100);
        data.put("Siraj", 80);
        data.put("Rohit", 110);
        data.put("Dhoni", 90); //Remove

        removeSecondHighestElement(data);
    }

    private static void removeSecondHighestElement(Map<String, Integer> data) {
        int max = 0;
        int secondHighest = 0;

        for(int i : data.values()){
            if(i>max){
                secondHighest = max;
                max = i;
            }else if(i>secondHighest){
                secondHighest = i;
            }

        }

        for(Map.Entry<String, Integer> dataEntry : data.entrySet()){
            if(dataEntry.getValue() == secondHighest){
                data.remove(dataEntry.getKey());
            }
        }

        System.out.println(data);
    }
}
