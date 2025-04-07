package April;

import java.util.Arrays;

public class MergeTwoArrays {
    public static void main(String[] args){
        int[] arr1 = {5,3,2};
        int[] arr2 = {9,0,1};
        mergeTwoArrays(arr1, arr2);
    }

    private static void mergeTwoArrays(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length+arr2.length];

        System.arraycopy(arr1, 0, result, 0, arr1.length);
        System.arraycopy(arr2, 0, result, arr1.length, arr2.length);

        System.out.println(Arrays.toString(result));
    }
}
