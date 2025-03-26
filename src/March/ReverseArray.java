package March;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args){
        int[] arr = {1, 4, 3, 2, 6, 5};
        reverseArray(arr);
    }

    private static void reverseArray(int[] arr) {
        int left = 0;
        int right = arr.length-1;

        while(left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left ++;
            right--;
        }
        System.out.println(Arrays.toString(arr));

    }
}
