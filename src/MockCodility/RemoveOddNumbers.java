package MockCodility;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemoveOddNumbers {
    public static void main(String[] args){
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6);
        removeOddNumbers(nums);
    }

    private static void removeOddNumbers(List<Integer> nums) {
        Iterator<Integer> iterator = nums.iterator();
        while(iterator.hasNext()){
            if(iterator.next() % 2 != 0){
                iterator.remove();
            }
        }
        // Print the modified list
        System.out.println(nums);
    }
}
