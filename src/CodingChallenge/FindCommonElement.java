package CodingChallenge;

import java.util.HashSet;
import java.util.Set;

public class FindCommonElement {
    public static void main(String[] args){
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {4,5,6,7,8};
        findCommonElement(arr1, arr2);
    }

    private static void findCommonElement(int[] arr1, int[] arr2) {
        Set<Integer> data = new HashSet<>();
        Set<Integer> common = new HashSet<>();

        for(int i=0;i<arr1.length;i++){
            data.add(arr1[i]);
        }

        for(int num : arr2){
            if(data.contains(num))
                common.add(num);
        }
        System.out.println(common);
    }
}
