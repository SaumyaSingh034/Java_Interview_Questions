package Arrays;

import java.util.Arrays;

public class KthLargestArray {
    public static void main(String[] args){
        int[] num = {3,2,1,5,6,4};
        int k =2;
        System.out.println(findKthLargest(num, k));
    }

    private static int findKthLargest(int[] num, int k) {
        Arrays.sort(num);
        return num[num.length-k];
    }
}
