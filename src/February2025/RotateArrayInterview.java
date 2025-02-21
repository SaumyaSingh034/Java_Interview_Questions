package February2025;

import java.util.Arrays;

public class RotateArrayInterview {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        int k=2;
        rotateArrayBased(arr, k);

    }

    private static void rotateArrayBased(int[] arr, int k) {
        for(int i=0;i<k;i++){
            int temp = arr[0];
            for(int j=1;j< arr.length;j++){
                arr[j-1] = arr[j];
            }
            arr[arr.length-1] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
