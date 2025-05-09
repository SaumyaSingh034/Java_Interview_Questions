package May.InterviewQuestions2025;

import java.util.Arrays;

public class CustomizeArray {
    public static void main(String[] args){
        int[] arr = {3,5,4,6,1,9,4,2,0,7,8,3,1,11,23,45,66,72,31,26};
        customizeArray(arr);
    }

    private static void customizeArray(int[] arr) {
        int result[] = new int[arr.length];
        int left=0;
        int right = arr.length-1;
        for(int i=0;i< arr.length;i++){
            if(arr[i]%2==0){
                result[left++] = arr[i];
            }else{
                result[right--] = arr[i];
            }
        }
        System.out.println(Arrays.toString(result));
    }
}
