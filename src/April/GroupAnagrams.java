package April;

import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args){
        String[] arr = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupAnagrams(arr));
    }

    private static ArrayList<List<String>> groupAnagrams(String[] arr) {
        Map<String, List<String>> map = new HashMap<>();
        for(String s : arr){
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            map.computeIfAbsent(key, k-> new ArrayList<>()).add(s);

        }
        return new ArrayList<>(map.values());
    }
}
