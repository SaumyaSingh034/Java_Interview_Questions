package April;

import java.util.LinkedHashSet;
import java.util.Set;

public class IntersectionOfTwoArrays {
    public static void main(String[] args){
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {3, 4, 5, 6, 7};
        intersectTwoArrays(arr1, arr2);
    }

    private static void intersectTwoArrays(int[] arr1, int[] arr2) {
        Set<Integer> set1 = new LinkedHashSet<>();
        Set<Integer> result = new LinkedHashSet<>();

        for(int i : arr1)
            set1.add(i);
        for(int num : arr2){
            if(set1.contains(num)){
                result.add(num);
            }
        }
        System.out.println(result);

    }
}
