package April;

import java.util.Arrays;

public class EvenLeftandOddRight {
    public static void main(String[] args){
        int[] arr = {2, 0, 4, 0, 3, 0, 5, 0};
        shiftEvenLeftAndOddRight(arr);

    }

    private static void shiftEvenLeftAndOddRight(int[] arr) {
        int[] result = new int[arr.length];
        int left = 0;
        int count = 0;
        int right = arr.length-1;
        for(int i : arr){
           if(i != 0){
               result[right--] = i;
           }
        }
        System.out.println(Arrays.toString(result));
    }
}
