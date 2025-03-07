package CodingChallenge_90Days;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateAndMaintainOrder {
    public static void main(String[] args){
        int[] arr = {4, 2, 9, 4, 2, 8};
        System.out.println(Arrays.toString(removeDuplicateMaintaiOrder(arr)));
    }

    private static Object[] removeDuplicateMaintaiOrder(int[] arr) {
        Set<Integer> result = new LinkedHashSet<>();
        for(int i : arr){
            result.add(i);
        }
        return result.toArray();
    }
}
