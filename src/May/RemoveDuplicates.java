package May;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args){
        List<Integer> data = Arrays.asList(1,1,3,4,2,4,3,6,7,7,8,9,8);
        removeDuplicatesFromList(data);
    }

    private static void removeDuplicatesFromList(List<Integer> data) {
        Set<Integer> dataSet = new LinkedHashSet<>(data);
        System.out.println(dataSet);
    }
}
