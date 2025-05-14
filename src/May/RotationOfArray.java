package May;

import java.util.Arrays;

public class RotationOfArray {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        int rotation = 2;
        rotateTheArray(arr, rotation);
    }

    private static void rotateTheArray(int[] arr, int rotation) {
        for(int i=0;i<rotation;i++){
            int last = arr[arr.length-1]; //5
            for(int j= arr.length-1;  j>0 ; j--){
                arr[j] = arr[j-1];
            }
            arr[0] = last;
        }
        System.out.println(Arrays.toString(arr));

    }
}
