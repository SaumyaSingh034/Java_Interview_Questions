package March;

import java.util.Arrays;

public class DisplayTheIndex {
    public static void main(String[] args){
        int[] arr = {1,1,1,2,2,2,2,3,3,4,4,5,6,7,8,8,8};
       displayTheIndex(arr, 1);
       displayTheIndex(arr, 4);
       displayTheIndex(arr, 415);
    }

    private static void displayTheIndex(int[] arr, int number) {
        for(int i=0;i< arr.length;i++){
            if(arr[i] == number){
                System.out.println(number+" occurred in following indexes --> "+i+" ");
            } else if (!Arrays.toString(arr).contains(String.valueOf(number))) {
                System.out.print("Number is not found in Array : "+number);
                break;
            }
        }
    }
}
