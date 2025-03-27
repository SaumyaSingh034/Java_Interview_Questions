package March;

import java.util.Arrays;

public class ShiftZeroToEnd {
    public static void main(String[] args){
        int[] arr = {1,0,3,5,0,1};
        shiftZeroToEnd(arr);
    }

    private static void shiftZeroToEnd(int[] arr) {
        int j=0;
        for(int i=0;i< arr.length;i++){
            if(arr[i] != 0){
                arr[j++] = arr[i];
            }
        }

        for(int i=j;i< arr.length;i++){
            arr[i] = 0;
        }
        System.out.println(Arrays.toString(arr));
    }
}
