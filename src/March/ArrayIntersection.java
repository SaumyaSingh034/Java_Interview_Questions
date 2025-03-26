package March;

import java.util.HashSet;
import java.util.Set;

public class ArrayIntersection {
    public static void main(String[] args){
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {3, 4, 5, 6, 7};
        findIntersection(arr1, arr2);
    }

    private static void findIntersection(int[] arr1, int[] arr2) {
        Set<Integer> dataSet = new HashSet<>();
        for(int i : arr1){
            dataSet.add(i);
        }

        for(int i : arr2){
            if(dataSet.contains(i)){
                System.out.print(i+" ");
            }
        }

    }
}
