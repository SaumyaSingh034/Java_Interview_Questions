package April;

import java.util.Arrays;

public class ProductOfIndexs {
    public static void main(String[] args){
        int[] input = {1,2,3,4};
        productsArray(input);
    }

    private static void productsArray(int[] input) {
        int n  = input.length;
        int[] result = new int[n];
        result[0] = 1;
        for(int i=1;i<n;i++){
            result[i] = result[i-1] * input[i-1];
        }
        int rightProduct = 1;
        for(int i=n-1;i>=0;i--){
            result[i] *= rightProduct;
            rightProduct *= input[i];
        }
        System.out.println(Arrays.toString(result));

    }
}
