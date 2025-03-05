package March;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeTwoArray {
    public static void main(String[] args){
        int[] arr1 = {5,3,2};
        int[] arr2 = {9,0,1};
        System.out.println(Arrays.toString(mergeTwoArrayUaingStream(arr1, arr2)));
    }

    private static int[] mergeTwoArrayUaingStream(int[] arr1, int[] arr2) {
        return IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2)).toArray();
    }
}
