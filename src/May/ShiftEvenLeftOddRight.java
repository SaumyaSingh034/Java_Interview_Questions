package May;

import java.util.Arrays;

public class ShiftEvenLeftOddRight {
    public static void main(String[] args){
        int[] arr  = {1,2,3,4,5,6,7,8,9};
        shiftEvenLeftAndOddRight1(arr);
    }

    private static void shiftEvenLeftAndOddRight1(int[] arr) {
        int[] result = new int[arr.length];
        int right = arr.length-1;
        int left =0;
       for(int i : arr){
           if(i%2==0){
               result[left++] = i;
           }else{
               result[right--] = i;
           }
       }
       System.out.println(Arrays.toString(result));
    }
}
