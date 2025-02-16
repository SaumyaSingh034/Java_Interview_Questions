package Arrays;

import java.util.*;

public class RemoveDuplicatesAndMerge {
    public static void main(String[] args){
        int[] arr1 = {1,2,3,4,5,11};
        int[] arr2 = {3,4,5,6,7,8,9,10};

        removeDuplicatesAndMerge(arr1, arr2);
    }

    private static void removeDuplicatesAndMerge(int[] arr1, int[] arr2) {
       int resultLength = arr1.length + arr2.length;
       int[] result = new int[resultLength];

       //Using Predefined function
        System.arraycopy(arr1,0,result,0,arr1.length);
        System.arraycopy(arr2,0,result,arr1.length,arr2.length);

        Set<Integer> data = new HashSet<>();
        for(int i : result){
            data.add(i);
        }

        System.out.println(Arrays.toString(result));
        System.out.println(data);
        System.out.println(Arrays.toString(data.toArray()));



    }

    //private static void removeDuplicatesAndMerge
}
