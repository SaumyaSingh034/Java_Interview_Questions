package May;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElement {
    public static void main(String[] args){
        int[] arr = {1,1,2,2,3,4,5,5,3};
        findDuplicateElements(arr);

    }

    private static void findDuplicateElements(int[] arr) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for( int i : arr){
            if(!set1.add(i))
                set2.add(i);
        }
        System.out.println(set2);
    }
}
