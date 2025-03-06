package March;

import java.util.Arrays;

public class DynamicSumArray {
    public static void main(String[] args){
        int[] arr2 = {9,9,9};
        int[] arr1 = {1,2,9};
        System.out.println(Arrays.toString(addOneToLastDigit(arr2)));

    }

    private static int[] addOneToLastDigit(int[] arr1) {
        for(int i= arr1.length-1;i>=0;i--){
            if(arr1[i]+1 !=10){
                arr1[i] += 1;
                return arr1;
            }
            arr1[i] = 0;
        }
        int[] resultArray = new int[arr1.length+1];
        resultArray[0] = 1;
        return resultArray;
    }
}
