package Arrays;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        int rotate = 2;
        int[] arr1 = {3, 8, 9, 7, 6};
        int k = 3;
        rotateArray(arr,rotate);
        rotateArray(arr1,k);
    }

    private static void rotateArray(int[] arr, int rotate) {
        for(int i=0;i<rotate;i++){
            int temp = arr[0]; //1
            for(int j=1;j< arr.length;j++){
                arr[j-1] = arr[j];
            }
            arr[arr.length-1] = temp;
        }

        System.out.println(Arrays.toString(arr));
    }
}
