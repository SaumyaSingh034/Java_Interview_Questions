package May;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterEvenOddAndSquare {
    public static void main(String[] args){
        List<Integer> data = Arrays.asList(2,3,4,5,8,9,6,7);
        System.out.println(filterEvenOddAndSquare(data));
    }

    private static List<Integer> filterEvenOddAndSquare(List<Integer> data) {
        return data.stream().filter(n-> n%2==0).map(n-> n* n)
                .collect(Collectors.toList());
    }
}
