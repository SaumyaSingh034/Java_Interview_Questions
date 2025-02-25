package InterviewQuestions;

import java.util.Arrays;

public class AIRTEL_FindThirdLargest {
    public static void main(String[] args) {
        int[] arr = {1,2,5,6,3,4};
        int[] arr1 =  {1,0,1,0,-1};
        int[] arr2 =  {-1,-2,-3,-4,-5,-6,0};
        findThirdMax(arr1);
    }

    private static void findThirdMax(int[] arr) {
        if(arr.length<3){
            System.out.println("Invalid Array as length is less than 3");
        } else if(arr.length ==3 ){
            Arrays.sort(arr);
            System.out.println("Third Max is : "+arr[0]);

        } else{
            int max = arr[0], sMax=Integer.MIN_VALUE,tMax=Integer.MIN_VALUE;
            for(int i=0;i< arr.length;i++){
                if(arr[i]>max){
                    tMax = sMax;
                    sMax = max;
                    max = arr[i];
                } else if (arr[i]>sMax && arr[i]<max) {
                    tMax = sMax;
                    sMax = arr[i];

                } else if (arr[i]>tMax && arr[i]<sMax) {
                    tMax = arr[i];

                }

            }
            if(tMax!=Integer.MIN_VALUE)
                System.out.println(tMax);
            else
                System.out.println("No Third Max Value");
        }
    }

}
