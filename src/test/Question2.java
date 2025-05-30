package test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Question2 {
    public static void main(String[] args) {
        int[] arr = {1,2,5,6,3,4};
        int[] arr1 =  {1,0,1};
        findThirdLargestArray(arr1);
    }

    private static void findThirdLargestArray(int[] arr) {
        int len = arr.length-1;
        List<Integer> data = Arrays.asList(1,0,1,0);
        Collections.sort(data);
        System.out.println(data.get(arr.length-3));

        int max=Integer.MIN_VALUE, secMax=Integer.MIN_VALUE, tMax=Integer.MIN_VALUE;
        for(int i=0;i< arr.length;i++){
            if(arr[i]>max){
                tMax = secMax;
                secMax = max;
                max = arr[i]; //-1
            }else if(arr[i]>secMax && arr[i]<max ){
                tMax = secMax;
                secMax = arr[i];
            }else if(arr[i]>tMax && secMax!=max ){
                tMax = arr[i];
            }else{
                System.out.println("Doesnot exist");
            }
        }

        System.out.println(tMax);
    }
}
