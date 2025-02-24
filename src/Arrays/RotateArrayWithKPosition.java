package Arrays;

import java.util.Arrays;

public class RotateArrayWithKPosition {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7};
        int k = 3;
        rotateArrayBasedK(arr, k);
    }

    private static void rotateArrayBasedK(int[] arr, int k) {
        for(int i=0;i<k;i++){
            int temp = arr[0];
            for(int j=1;j< arr.length-1;j++){
                arr[j-1] = arr[j];

            }
            arr[arr.length-1] = temp;
        }

        System.out.println(Arrays.toString(arr));
    }
}
