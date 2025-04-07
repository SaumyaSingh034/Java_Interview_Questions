package April;

import java.util.Arrays;

public class IncrementArray {
    public static void main(String[] args){
        int[] digits1 = {1, 2, 9};
        int[] digits2 = {9, 9, 9};

        System.out.println("Output 1: " + Arrays.toString(increment(digits1)));
        System.out.println("Output 2: " + Arrays.toString(increment(digits2)));
    }

    private static int[] increment(int[] digits) {
        int n = digits.length;
        for(int i=n-1;i>=0;i--){
            if(digits[i] < 9 ){
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] result = new int[n+1];
        result[0] = 1;
        return result;
    }
}
