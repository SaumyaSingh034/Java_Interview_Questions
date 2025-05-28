package Codility;

import java.util.HashMap;
import java.util.Map;

public class OddOccurences {
    public static void main(String[] args){
        int[] arr = {9,3,9,3,9,7,9, 7};
        System.out.println(countOddOcuurences(arr));
    }

    private static int countOddOcuurences(int[] arr) {
    Map<Integer, Integer> data = new HashMap<>();
    int odd = 0;
    for(int i : arr){
        data.put(i, data.getOrDefault(i, 0)+1);
    }

    for(Map.Entry<Integer, Integer> set : data.entrySet()){
        if(set.getValue() == 1)
            odd = set.getKey();


    }
        return odd;
    }
}
