package May;

import java.util.Arrays;

public class RightNRotation {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        int rotation = 1;
        rightRotate(arr, 2);
//        rightRotate(arr, 2);
//        rightRotate(arr, 3);
//        rightRotate(arr, 4);
//        rightRotate(arr, 5);
//        rightRotate(arr, 6);
    }

    private static void rightRotate(int[] arr, int rotation) {
        for(int i=0;i<rotation;i++){
            int last  = arr[arr.length-1]; //9
            for(int j= arr.length-1;j>0;j--){
                arr[j] = arr[j-1];
            }
            arr[0] = last;
        }
        System.out.println(Arrays.toString(arr));
    }
}
