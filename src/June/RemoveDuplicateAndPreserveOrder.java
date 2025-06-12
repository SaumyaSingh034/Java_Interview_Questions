package June;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class RemoveDuplicateAndPreserveOrder {
    public static void main(String[] args){
        List<String> input = Arrays.asList("apple", "banana", "apple", "orange");
        System.out.println(removeDuplicatesPreserveOrder(input));
    }

    private static ArrayList<String> removeDuplicatesPreserveOrder(List<String> input) {
        return new ArrayList<>(new LinkedHashSet<>(input));
    }
}
