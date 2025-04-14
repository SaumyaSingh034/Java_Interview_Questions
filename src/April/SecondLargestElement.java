package April;

import java.util.HashSet;
import java.util.Set;

public class SecondLargestElement {
    public static void main(String[] args){
        int[] arr = {2, -1, -1, 3, 4, 5, 5, 2};
        System.out.println(secondLargestElement(arr));
    }

    private static int secondLargestElement(int[] arr) {
        Set<Integer> dataElement = new HashSet<>();
        for(int i : arr){
            dataElement.add(i);
        }

        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;
        for(int i : dataElement){
            if(i>max){
                secMax = max;
                max = i;
            } else if (i>secMax) {
                secMax = i;

            }
        }
        return secMax;

    }
}
