package May.InterviewQuestions2025;

import java.util.HashMap;
import java.util.Map;

public class NAB_Round2 {
    public static void main(String[] args){
        String str = "philadelphia is a place ";
        printCountOfVowels(str);
    }

    private static void printCountOfVowels(String str) {
       // String vowels = str.replaceAll("^[*aeiou]*", "");
        Map<Character, Integer> dataMap = new HashMap<>();
        for(char c : str.replaceAll(" ","").toCharArray()){
            dataMap.put(c, dataMap.getOrDefault(c, 0)+1);
        }


        for(Map.Entry<Character, Integer> dataSet : dataMap.entrySet()){
            if(dataSet.getKey() == 'a' || dataSet.getKey() == 'e' ||
                    dataSet.getKey() == 'i' || dataSet.getKey() == 'o'
            || dataSet.getKey() == 'u'){

            }
        }

    }
}
