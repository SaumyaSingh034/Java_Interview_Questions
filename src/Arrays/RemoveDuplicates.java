package Arrays;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args){
        int[] arr = {1,1,2,2,3,4,4,5};
       System.out.println(Arrays.toString( removeDuplicates(arr)));
    }

    private static Object[] removeDuplicates(int[] arr) {
        Set<Integer> data = new LinkedHashSet<>();
        for(int i=0;i< arr.length;i++){
            data.add(arr[i]);
        }

        return data.toArray();
    }
}
