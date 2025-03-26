package March;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseWordsString {
    public static void main(String[] args){
        String input = "i.like.this.program.very.much";
        System.out.println(reverseWords(input));
    }

    private static String reverseWords(String input) {
        List<String> words = new ArrayList<>();
        String[] parts = input.split("\\.");
        for(String word: parts){
            if(!word.isEmpty()){
                words.add(word);
            }
        }
        System.out.println(words);
        Collections.reverse(words);
        System.out.println(words);
        return String.join(".", words);

    }
}
