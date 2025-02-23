package Arrays;

import java.util.Arrays;

public class ShifttZeroAtEnd {
    public static void main(String[] args){
        int[] arr = {1,0,3,0,4,8,9,3,4,0,1,1};
        shiftZeroAtEnd(arr);
    }

    private static void shiftZeroAtEnd(int[] arr) {
        int j = 0;
        for(int i=0;i< arr.length;i++){
            if(arr[i]!=0) {
                arr[j++] = arr[i];
            }
        }
        for(int i=j;i< arr.length;i++){
            arr[i]=0;
        }
        System.out.println(Arrays.toString(arr));
    }
}
