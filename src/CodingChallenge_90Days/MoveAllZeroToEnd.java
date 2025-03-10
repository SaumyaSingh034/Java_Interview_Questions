package CodingChallenge_90Days;

import java.util.Arrays;

public class MoveAllZeroToEnd {
    public static void main(String[] args){
        int[] arr = {0,1,0,3,12};
        moveZeroToEnd(arr);

    }

    private static void moveZeroToEnd(int[] arr) {
        int j = 0;
        for(int i=0;i< arr.length;i++){
            if(arr[i]!=0){
                arr[j++] = arr[i];
            }
        }

        for(int i=j;i< arr.length;i++){
            arr[i] = 0;
        }
        System.out.println(Arrays.toString(arr));
    }
}
