package Codility;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstUniqueElement {
    public static void main(String[] args){
        int[] arr = {4,10,5,4,2,10};
        System.out.println(findFirstUniqueNumber(arr));
    }

    private static Integer findFirstUniqueNumber(int[] A) {
        Map<Integer, Integer> dataMap = new LinkedHashMap<>();
        for(int i : A){
            dataMap.put(i, dataMap.getOrDefault(i, 0)+1);
        }

        for(Map.Entry<Integer, Integer> data : dataMap.entrySet()){
            if(data.getValue() == 1)
                return data.getKey();
        }

        return 0;
    }
}
