package CodingChallenge_90Days;

import java.util.*;

public class IntersectionArray {
    public static void main(String[] arr){
        int[] arr1 = {1,2,2,3};
        int[] arr2 = {2,2,4};
       System.out.println(Arrays.toString( intersectionOfTwoArray(arr1, arr2)));
    }

    private static int[] intersectionOfTwoArray(int[] arr1, int[] arr2) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        for(int i : arr1) map.put(i, map.getOrDefault(i, 0)+1);
        for(int i : arr2) {
            if(map.getOrDefault(i,0)>0){
                result.add(i);
                map.put(i, map.get(i)-1);
            }
            return result.stream().mapToInt(k -> k).toArray();
        }


        return arr1;
    }
}
