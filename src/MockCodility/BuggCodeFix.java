package MockCodility;

import java.util.Arrays;
import java.util.List;

public class BuggCodeFix {
    public static void main(String[] args){
        List<Integer> number = Arrays.asList(1,2,3,4,5);
        int result = findSum(number);
        System.out.println(result);
    }

    public static int findSum(List<Integer> numbers) {
        int sum = 0;
        for (Integer num : numbers) {
            if (num == null) {
                numbers.remove(num);
            } else {
                sum += num;
            }
        }
        return sum;
    }
}
