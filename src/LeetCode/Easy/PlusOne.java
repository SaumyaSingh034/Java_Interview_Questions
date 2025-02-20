package LeetCode.Easy;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args){
        int[] digits = {1,2,3};
        int[] digit1 = {4,3,2,1};
        int[] digit2 = {9};
        int[] digit3 = {9,9};
        int[] digit4 = {9,8,7,6,5,4,3,2,1,0};
//        System.out.println(Arrays.toString(plusOne(digits)));
//        System.out.println(Arrays.toString(plusOne(digit1)));
//        System.out.println(Arrays.toString(plusOne(digit2)));
//        System.out.println(Arrays.toString(plusOne(digit3)));
  //      System.out.println(Arrays.toString(plusOne(digit4))); //ERROR IN THIS ONE

//        System.out.println(Arrays.toString(plusOneLeetCode(digits)));
//        System.out.println(Arrays.toString(plusOneLeetCode(digit1)));
        System.out.println(Arrays.toString(plusOneLeetCode(digit2)));
        System.out.println(Arrays.toString(plusOneLeetCode(digit3)));
        System.out.println(Arrays.toString(plusOneLeetCode(digit4))); //ERROR IN THIS ONE
    }

    private static int[] plusOne(int[] digits) {
        int[] result = new int[digits.length];

        StringBuffer sb = new StringBuffer();
        for(int i =0;i< digits.length;i++){
            sb.append(digits[i]);
        }
        int number = Integer.parseInt(sb.toString());
        number = number+1;
        int length = 0;
        if(number> 9 && digits.length != String.valueOf(number).length()){
            length = String.valueOf(number).length();
            result = new int[length];
        }
        for(int i = result.length-1;i>=0;i--){
            int n = number%10;
            number = number/10;
            result[i] = n;
        }

       return result;
    }

    private static int[] plusOneLeetCode(int[] digits){
        for(int i= digits.length-1;i>=0;i--){
            if(digits[i]+1 !=10){
                digits[i] += 1;
                return digits;
            }
            digits[i] = 0;
        }
        int[] newDigits = new int[digits.length+1];
        newDigits[0]=1;
        return newDigits;
    }
}
