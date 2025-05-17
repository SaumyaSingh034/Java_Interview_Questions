package May.InterviewQuestions2025;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class OPTUM_RemoveDuplicates {
    public static void main(String[] args){
        String str = "Automation";
        removeDuplicatesFromString(str);
        onlyUniqueLetters(str);
    }

    private static void onlyUniqueLetters(String str) {
        Map<Character, Integer> unique = new HashMap<>();
        for(char c : str.toLowerCase().toCharArray()){
            unique.put(c, unique.getOrDefault(c, 0)+1);
        }

        for(Map.Entry<Character, Integer> keySet : unique.entrySet()){
            if(keySet.getValue() == 1){
                System.out.println(keySet.getKey());
            }
        }
    }

    private static void removeDuplicatesFromString(String str) {
        Set<Character> unique = new HashSet<>();
        Set<Character> duplicate = new HashSet<>();

        for(char c : str.toLowerCase().toCharArray()){
            if(!unique.add(c)) {
                duplicate.add(c);
            }
        }
        System.out.println("Unique : "+unique);
        System.out.println("Duplicate : "+duplicate);
    }
}
