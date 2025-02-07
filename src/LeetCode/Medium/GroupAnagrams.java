package LeetCode.Medium;

import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args){
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        String[] strs1 = {""};
        String[] strs2 = {"a"};
        System.out.println(groupAnagrams(strs));
        System.out.println(groupAnagrams(strs1));
        System.out.println(groupAnagrams(strs2));
    }

    private static ArrayList<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap<>();
        for(String word : strs){
            char[] ch = word.toCharArray();
            Arrays.sort(ch);
            String sortedWord = new String(ch);
            if(!map.containsKey(sortedWord)){
                map.put(sortedWord, new ArrayList<>());
            }
            map.get(sortedWord).add(word);


        }
        return new ArrayList<>(map.values());
    }
}
