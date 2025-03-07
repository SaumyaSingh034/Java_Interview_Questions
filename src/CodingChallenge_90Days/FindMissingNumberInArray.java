package CodingChallenge_90Days;

import java.util.Arrays;

public class FindMissingNumberInArray {
    public static void main(String[] args){
        int[] arr = {1,2,4,5};
        int n=5;
        System.out.println(findMissingNumber(arr, n));
    }

    private static int findMissingNumber(int[] arr, int n) {
        int sumExpected = n * (n+1)/2;
        int sumActual = Arrays.stream(arr).sum();
        return sumExpected-sumActual;
    }
}
