package May;

import java.util.Arrays;

public class RotationArray {
    public static void main(String[] args){
        int rotation = 3;
        int[] arr = {1,2,3,4,5,6,7};
        int[] arr1 = {1,2,3,4,5,6,7};
        rotationOfArray(arr, rotation);
        rotateArrayBasedOnRotation(arr1, rotation);
    }

    private static void rotateArrayBasedOnRotation(int[] arr, int rotation) {
        for(int i=0;i<rotation;i++){
            int last = arr[arr.length-1];
            for(int j = arr.length-1;j>0;j--){
                arr[j] = arr[j-1];
            }
            arr[0] = last;
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void rotationOfArray(int[] arr, int rotation) {
        for(int i=0;i<rotation;i++){
            int last = arr[arr.length-1];
            for(int j= arr.length-1;j>0;j--){
                arr[j] = arr[j-1];
            }
            arr[0] = last;
        }
        System.out.println(Arrays.toString(arr));
    }


}
