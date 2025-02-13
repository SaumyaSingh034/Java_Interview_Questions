package InterviewQuestions;

import java.util.Arrays;

public class NAGARRO_ShiftEvenLeftandOddRight {
    public static void main(String[] args){
        int[] arr = {3,5,4,6,1,9,4,2,0,7,8,3,1,11,23,45,66,72,31,26};
        shiftEvenToLeftOddToRight(arr);
    }

    private static void shiftEvenToLeftOddToRight(int[] arr) {
        int[] result = new int[arr.length];
        int k=0;
        int j = arr.length-1;
        for(int i=0;i< arr.length;i++){
            if(arr[i]%2==0){
                result[k++] = arr[i];
            }else{
                result[j--] = arr[i];
            }
        }
        System.out.println(Arrays.toString(result));

        }

}
