package Strings;

import java.util.Arrays;

public class SecondLargestInString {
    public static void main(String[] args){
        String str = "str1025rts";
        findSecondLargestInString(str);

    }

    private static void findSecondLargestInString(String str) {
        String digits = str.replaceAll("[a-zA-Z]", "");
        char[] ch = digits.toCharArray();
        int[] arr = new int[ch.length];
        for(int i=0;i< ch.length;i++){
            arr[i] = Character.getNumericValue(ch[i]);
        }
        findSecondLargest(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void findSecondLargest(int[] arr) {
        int max = Integer.MIN_VALUE;
        int Smax = Integer.MIN_VALUE;
        for(int i=0;i< arr.length;i++){
            if(arr[i]>max){
                Smax = max;
                max = arr[i];
            } else if (arr[i]>Smax && arr[i]<max) {
                Smax = arr[i];

            }

        }
        System.out.println(Smax);
    }
}
