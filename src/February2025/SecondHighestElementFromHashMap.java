package February2025;

import java.util.HashMap;
import java.util.Map;

public class SecondHighestElementFromHashMap {
    public static void main(String[] args){
        Map<String, Integer> marvel = new HashMap<>();
        marvel.put("IronMan", 10);
        marvel.put("Thor", 18);
        marvel.put("Loki", 20);
        marvel.put("Dr. Strange", 90);
        marvel.put("Hulk", 7);
        marvel.put("Captain America", 87);
        printSecondHighestElement(marvel);
    }

    private static void printSecondHighestElement(Map<String, Integer> marvel) {
        Integer secondHighestData = 0;
        Integer highestData = 0;
        for(Map.Entry<String, Integer> data : marvel.entrySet()){
            if(highestData < data.getValue()){
                secondHighestData = highestData;
                highestData = data.getValue();
            }else if(secondHighestData < data.getValue()){
                secondHighestData = data.getValue();
            }
        }
        System.out.println(secondHighestData);
        for(Map.Entry<String, Integer> data : marvel.entrySet()){
            if (data.getValue() == secondHighestData){
                System.out.println(data.getKey()+" ====  "+data.getValue());
            }
        }
    }
}
