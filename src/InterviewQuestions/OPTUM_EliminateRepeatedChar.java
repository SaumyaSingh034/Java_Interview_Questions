package InterviewQuestions;

import java.util.HashSet;
import java.util.Set;

public class OPTUM_EliminateRepeatedChar {
    public static void main(String[] args){
        String str = "Automation";
        eliminateDuplicateValues(str);
    }

    private static void eliminateDuplicateValues(String str) {
        Set<Character> unique = new HashSet<>();
        Set<Character> duplicates = new HashSet<>();

        for(char c : str.toLowerCase().toCharArray()){
            if(!unique.add(c))
                duplicates.add(c);

        }
        System.out.println(unique);
        System.out.println(duplicates);
    }
}
