package May;

import java.util.Arrays;

public class Question4 {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6};
        int k = 2;
        rotateRightArray001(arr, k);
    }

    private static void rotateRightArray001(int[] arr, int k) {
        int last;
       for(int i=0;i<k;i++){
           last = arr[arr.length-1];
           for(int j = arr.length-1;j>0;j--){
               arr[j] = arr[j-1];
           }
           arr[0] = last;
       }
       System.out.println(Arrays.toString(arr));
    }
}
