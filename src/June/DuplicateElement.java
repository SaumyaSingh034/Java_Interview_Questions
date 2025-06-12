package June;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElement {
    public static void main(String[] args){
        int[] arr = {1,2,3,1,2,4,5};
        findDuplicatesElementFromArray1(arr);
    }

    private static void findDuplicatesElementFromArray1(int[] arr) {
        Set<Integer> unique = new HashSet<>();
        Set<Integer> duplicate = new HashSet<>();

        for(int i : arr){
            if(!unique.add(i))
                duplicate.add(i);
        }
        System.out.println(unique);
        System.out.println(duplicate);
    }
}
