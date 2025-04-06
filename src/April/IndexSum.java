package April;

import java.util.ArrayList;
import java.util.List;

public class IndexSum {
    public static void main(String[] args){
        int[] input = {2,7,11,15,8,1,8};
        int target = 9;
        findSumFromIndex(input, target);
    }

    private static void findSumFromIndex(int[] input, int target) {
        int sum = 0;
        List<Integer> result = new ArrayList<>();
        for(int i=0;i<input.length-1;i++){
            sum = input[i] + input[i+1];
            if(sum == target){
                result.add(i);
                result.add(i+1);
                sum = 0;
            }
        }
        System.out.println(result);
    }
}
