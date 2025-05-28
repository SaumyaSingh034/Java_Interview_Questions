package Codility;

import java.util.Arrays;



public class ArrayRotation {
    public static void main(String[] args){
        int[] arr = {3, 8, 9, 7, 6};
        int k = 3;
        int[] arr1 = {0,0,0};
        int k1 = 1;
        int[] arr2 = {1,2,3,4};
        int k2 = 4;
        rotateArray4(arr, k);
        rotateArray4(arr1, k1);
        rotateArray4(arr2, k2);
        //rotateArray(arr, k);
    }

    private static void rotateArray4(int[] arr, int k) {
        for(int i=0;i<k;i++){
            int last = arr[arr.length-1];
            for(int j= arr.length-1;j>0;j--){
                arr[j] = arr[j-1];

            }
            arr[0] = last;
        }
        System.out.println(Arrays.toString(arr));
    }
}
