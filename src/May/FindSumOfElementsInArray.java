package May;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindSumOfElementsInArray {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        int sum = 6;
        findTheTarget(arr, sum);
        rotate(arr, 1);
    }

    private static void findTheTarget(int[] arr, int sum) {
        List<Integer> resultTarget = new ArrayList<>();
        for(int i=0;i< arr.length;i++){
            for(int j=i+1;j< arr.length;j++){
                int target = arr[i] + arr[j];
                if(target == sum){
                    resultTarget.add(arr[i]);
                    resultTarget.add(arr[j]);
                }
            }

        }
        System.out.println(resultTarget);
    }

    private static void rotate(int[] arr, int k){
        for(int i=0;i<k;i++){
            int last = arr[arr.length-1];
            for(int j= arr.length-1;j>0;j--){
                arr[j] = arr[j-1];
            }
            arr[0] = last;
        }
        System.out.println(Arrays.toString(arr));


    }
}
