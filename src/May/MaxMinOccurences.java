package May;

import java.util.HashMap;
import java.util.Map;

public class MaxMinOccurences {
    public static void main(String[] args){
        String str = "Teeeessst Autoooooomationn";
        maxAndMinOccurencesChar(str);
    }

    private static void maxAndMinOccurencesChar(String str) {
        Map<Character, Integer> data = new HashMap<>();
        for(char c : str.toLowerCase().toCharArray()){
            data.put(c, data.getOrDefault(c,0)+1);
        }
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        char minChar = ' ';
        char maxChar = ' ';
//        for(int i : data.values()){
//            if(i>max){
//                max = i;
//            } else if (i<min) {
//                min = i;
//
//            }
//        }
//        System.out.println(max);
//        System.out.println(min);

        for(Map.Entry<Character, Integer> datSet : data.entrySet()){
            if(datSet.getValue() > max){
                max = datSet.getValue();
                maxChar = datSet.getKey();
            } else if (datSet.getValue()<min) {
                min = datSet.getValue();
                minChar = datSet.getKey();
            }
        }
        System.out.println(maxChar+" ---> "+max);
        System.out.println(minChar+" ---> "+min);
    }
}
