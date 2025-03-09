package CodingChallenge_90Days;

import java.util.Arrays;
import java.util.Comparator;

public class SortArrayOnLength {
    public static void main(String[] args){
        String[] str = {"apple", "kiwi", "banana"};
        sortArrayBasedOnLength(str);
    }

    private static void sortArrayBasedOnLength(String[] str) {
         Arrays.sort(str, Comparator.comparingInt(String::length));
         System.out.println(Arrays.toString(str));
    }
}
