package May;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortByLastDigit {
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(21,13,45,32,11);
        Collections.sort(list,(a,b) -> a%10 - b%10);
        System.out.println(list);
    }
}
