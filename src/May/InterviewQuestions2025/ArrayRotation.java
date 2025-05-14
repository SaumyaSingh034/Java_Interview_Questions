package May.InterviewQuestions2025;

import java.util.Arrays;

public class ArrayRotation {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        int rotation = 2;
        rotateArrayInt(arr, rotation);
        //5,1,2,3,4
        //4,5,1,2,3
    }

    private static void rotateArrayInt(int[] arr, int rotation) {

        for(int k = 0; k<rotation; k++){
            int last = arr[arr.length-1]; //5
            for(int i= arr.length-1;i>0;i--){
                arr[i] = arr[i-1];
            }
            arr[0] = last;
        }

        System.out.println(Arrays.toString(arr));

    }
}
