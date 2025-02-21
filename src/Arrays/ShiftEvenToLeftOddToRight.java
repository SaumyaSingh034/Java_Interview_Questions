package Arrays;

import java.util.Arrays;

public class ShiftEvenToLeftOddToRight {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        manipulateArray(arr);
    }

    private static void manipulateArray(int[] arr) {
        int left = 0;
        int right = arr.length-1;
        int[] result = new int[arr.length];

        for(int i=0;i< arr.length;i++){
            if(arr[i]%2==0){
                result[left++] = arr[i];
            }else {
                result[right--] = arr[i];
            }
        }

        System.out.println(Arrays.toString(result));
    }
}
