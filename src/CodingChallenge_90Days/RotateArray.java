package CodingChallenge_90Days;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args){
        int[] arr = {3, 2, 1, 5, 6, 4};
        int[] arr1 = {1,2,3,4,5};
        int rotate = 2;
        System.out.println(Arrays.toString(rotateArrayRotation(arr1, rotate)));
    }

    private static int[] rotateArrayRotation(int[] arr, int rotate) {
        for(int i=1;i<rotate;i++){
            int temp = arr[0];
            for(int j = 1;j< arr.length;j++){
                arr[j-1] = arr[j];
            }
            arr[arr.length-1] = temp;
        }
        return arr;
    }
}
