package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test6 {
    public static void main(String[] args){
        int[] arr = {6,5,7,2,9,3,3,4,5,6}; //5
        String str = "saumyasingh";
       // occurenceOfVowelInString(str);

        findSecondLargestArray(arr);
//        removeDuplicatesFromArray(arr);

    }

    private static void occurenceOfVowelInString(String str) {
        //String vowels = str.replaceAll("[]")
        Map<Character, Integer> dataChar = new HashMap<>();

        for(char c : str.toCharArray()){
            dataChar.put(c, dataChar.getOrDefault(c,0)+1);
        }

        for(Map.Entry<Character, Integer> set : dataChar.entrySet()){
            if(set.getKey() == 'a' || set.getKey() == 'e' ||
                    set.getKey() == 'i' || set.getKey() == 'o'||
                    set.getKey() == 'u'){
                System.out.println(set.getKey()+" ---> "+set.getValue());
            }
        }
    }

    private static void removeDuplicatesFromArray(int[] arr) {
        List<Integer> result = new ArrayList<>();
        Map<Integer, Integer> data = new HashMap<>();

        for(int i : arr){
            data.put(i, data.getOrDefault(i,0)+1);
        }

        for(Map.Entry<Integer, Integer> dataSet : data.entrySet()){
            if(dataSet.getValue() == 1){
                result.add(dataSet.getKey());
            }
        }
        System.out.println(result);

    }

    private static void findSecondLargestArray(int[] arr) {
        int max =Integer.MIN_VALUE , secMax = Integer.MIN_VALUE;
        for(int i : arr){
            if(i>max){ //1
                secMax = max;
                max = i;  //1

            } else if (secMax < i) {
                secMax = i;

            }
        }
        System.out.println(secMax);
    }
}
