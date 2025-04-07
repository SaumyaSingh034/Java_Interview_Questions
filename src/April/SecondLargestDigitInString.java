package April;

import java.util.*;

public class SecondLargestDigitInString {
    public static void main(String[] args){
        String input = "str1025699rts";
        System.out.println(findSecondLargestDigit(input));
    }

    private static int findSecondLargestDigit(String input) {
        Set<Integer> digits = new LinkedHashSet<>();
        for(char c : input.toCharArray()){
            if(Character.isDigit(c)){
                digits.add(Character.getNumericValue(c));
            }
        }
        Object[] arr = digits.toArray();
        Arrays.sort(arr);
        return (int) arr[arr.length-2];
       // System.out.println(digits);
    }
}
