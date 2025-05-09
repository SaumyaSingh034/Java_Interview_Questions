package May;

import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateElementInString {

    public static void main(String[] args){
        String str = "Java is a programming language is a programming language";
        duplicateElement(str);
    }

    private static void duplicateElement(String str) {
        Set<String> unique = new LinkedHashSet<>();
        Set<String> duplicates = new LinkedHashSet<>();

        for(String s : str.split("\\s+")){
            if(!unique.add(s)){
                duplicates.add(s);
            }

        }
        System.out.println(duplicates);
    }
}
