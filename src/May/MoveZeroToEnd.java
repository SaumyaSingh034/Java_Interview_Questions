package May;

import java.util.Arrays;

public class MoveZeroToEnd {
    public static void main(String[] args){
        int[] arr = {0, 1, 0, 3, 12};
        moveZeroToEndOfArray(arr);
    }

    private static void moveZeroToEndOfArray(int[] arr) {
        int left = 0;

        for(int i=0;i< arr.length;i++){
            if(arr[i]!=0){
                arr[left++] = arr[i];
            }
        }
        for(int i=left;i< arr.length;i++){
            arr[i] = 0;
        }
        System.out.println(Arrays.toString(arr));
    }
}
