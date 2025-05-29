package MockCodility;

import java.util.Map;
import java.util.TreeMap;

public class MostFrequentNumber {
    public static void main(String[] args){
        int[] nums = {4, 1, 2, 2, 3, 3, 3, 4, 4};
        System.out.println(smallestFrequentNumber(nums));
    }

    private static Integer smallestFrequentNumber(int[] nums) {
        Map<Integer, Integer> data = new TreeMap<>();
        int max = Integer.MIN_VALUE;

        for(int i : nums){
            data.put(i, data.getOrDefault(i, 0)+1);
        }

        for(int i : data.values()){
            if(max < i)
                max = i;
        }

        for(Map.Entry<Integer, Integer> dataSet : data.entrySet()){
            if(dataSet.getValue() == max)
                return dataSet.getKey();
        }

        return -1;
    }
}
