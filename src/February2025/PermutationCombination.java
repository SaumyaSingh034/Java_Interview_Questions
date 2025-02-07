package February2025;

import java.util.ArrayList;
import java.util.List;

public class PermutationCombination {
    public static void main(String[] args){
        String str = "WXYZ";
        printPermutation(str);
    }

    private static void printPermutation(String str) {
        List<String> permutations = new ArrayList<>();
        permuteHelper(str, 0, new StringBuilder(), permutations);

    }

    private static void permuteHelper(String str, int i, StringBuilder stringBuilder, List<String> permutations) {
        if(i == str.length()) {
            permutations.add(stringBuilder.toString());
            return;
        }

        for(int k = i; k< str.length();k++){
            char ch = stringBuilder.charAt(k);
            stringBuilder.setCharAt(k,str.charAt(i) );

        }


    }
}
