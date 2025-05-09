package May.InterviewQuestions2025;

import java.util.Arrays;

public class Brightly_01 {
    public static void main(String[] args){
        int[] arr = {1,0,3,5,0,1};
        shiftZeroToEndOfArray(arr);
    }

    private static void shiftZeroToEndOfArray(int[] arr) {
        int result[] = new int[arr.length];
        int left=0;
        int right= arr.length-1;
        for(int i=0;i< arr.length;i++){
            if(arr[i]!=0){
                result[left++] = arr[i];
            }
            else{
                result[right--] = 0;
            }
        }
        System.out.println(Arrays.toString(result));
    }
}
