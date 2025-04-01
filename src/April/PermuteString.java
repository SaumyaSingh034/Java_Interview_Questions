package April;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PermuteString {
    public static void main(String[] args){
        String input = "abc";
        System.out.println(permuteString(input));
    }

    private static List<String> permuteString(String input) {
        List<String> ans = new ArrayList<>();
        StringBuilder str = new StringBuilder(input);
        recurPermute(0, str, ans);
        Collections.sort(ans);
        return ans;

    }

    private static void recurPermute(int i, StringBuilder str, List<String> ans) {
        if(i== str.length()) {
            ans.add(str.toString());
            return;
        }

        for(int j = i; j<str.length();j++){
            swap(str, i, j);
            recurPermute(i+1, str, ans);
            swap(str, i, j);
        }
    }

    private static void swap(StringBuilder str, int i, int j) {
        char temp = str.charAt(i);
        str.setCharAt(i, str.charAt(j));
        str.setCharAt(j, temp);
    }
}
