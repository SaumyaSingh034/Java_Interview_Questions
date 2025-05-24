package CodingChallenge;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args){
        String str = "Hi I love Automation I love Java I love coding Java coding";
        removeDuplicateFromString(str);
    }

    private static void removeDuplicateFromString(String str) {
        Set<String> uniqueWord = new HashSet<>();
        Set<String> duplicateWord = new HashSet<>();
        for(String s : str.split("\\s+")){
           if(!uniqueWord.add(s))
               duplicateWord.add(s);
        }

        System.out.println("Unique: -> "+uniqueWord);
        System.out.println("Duplicate: -> "+duplicateWord);
    }
}
