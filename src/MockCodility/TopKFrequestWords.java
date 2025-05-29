package MockCodility;


import java.util.*;

public class TopKFrequestWords {
    public static void main(String[] args){
        List<String> words = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple", "banana");
        int k = 2;

        topKFrequentWord(words, k);
    }

    private static void topKFrequentWord(List<String> words, int k) {
        Map<String, Integer> hashMap = new LinkedHashMap<>();
        List<String> result = new ArrayList<>();
        for(String s : words){
            hashMap.put(s, hashMap.getOrDefault(s, 0)+1);
        }

        for(Map.Entry<String, Integer> hashEntry : hashMap.entrySet()){
            if(hashEntry.getValue() >= k)
                result.add(hashEntry.getKey());
        }
        System.out.println(result);
    }
}
