package February2025;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeTwoArray {
    public static void main(String[] args){
        int[] arr1 = {1,2,3};
        int[] arr2 = {4,5,6};
        System.out.println(Arrays.toString(mergeTwoArray(arr1,arr2)));
    }

    private static int[] mergeTwoArray(int[] arr1, int[] arr2) {
        int[] arr = new int[arr1.length+ arr2.length];
        return IntStream.concat(Arrays.stream(arr1),Arrays.stream(arr2)).toArray();
    }
}
