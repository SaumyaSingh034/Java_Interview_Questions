package April;

import java.util.HashMap;
import java.util.Map;

public class OccurenceOfNumbers {
    public static void main(String[] args){
        int[] arr = {1,2,1,3,3,34,5,6,7,9,9,9};
        countOccurencesOfNumbers(arr);
    }

    private static void countOccurencesOfNumbers(int[] arr) {
        Map<Integer, Integer> dataMap = new HashMap<>();
        for(int i : arr){
            dataMap.put(i, dataMap.getOrDefault(i,0)+1);
        }

        for(Map.Entry datakey : dataMap.entrySet()){
            System.out.print(datakey.getKey()+" --> "+datakey.getValue()+", ");
        }
    }
}
