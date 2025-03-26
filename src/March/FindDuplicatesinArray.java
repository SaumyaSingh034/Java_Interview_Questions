package March;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicatesinArray {
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 2, 5, 6, 3};
        findDuplicates(arr);
    }

    private static void findDuplicates(int[] arr) {
        Set<Integer> set = new HashSet<>();
        System.out.print("Duplicates Numbers are : ---> ");
        for(int i : arr){
            if(!set.add(i)){
                System.out.print(i+" ");
            }
        }
    }
}
