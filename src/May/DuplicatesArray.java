package May;

import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicatesArray {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,2,3,4,6,7,8,9,1};
        findDuplicatesArray(arr);
    }

    private static void findDuplicatesArray(int[] arr) {
        Set<Integer> data = new LinkedHashSet<>();
        Set<Integer> duplicates = new LinkedHashSet<>();

        for(int i : arr){
            if(!data.add(i))
                duplicates.add(i);
        }
        System.out.println(duplicates);
    }
}
