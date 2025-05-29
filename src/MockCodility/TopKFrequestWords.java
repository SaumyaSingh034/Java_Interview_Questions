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

        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(hashMap.entrySet());
        Collections.sort(entryList, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                if(!o1.getValue().equals(o2.getValue())){
                    return o2.getValue() - o1.getValue();
                }else{
                    return o1.getKey().compareTo(o2.getKey());
                }
            }
        });

        List<String> result1 = new ArrayList<>();
        for(int i=0;i<k && i<entryList.size();i++){
            result1.add(entryList.get(i).getKey());
        }
        System.out.println(result1);

    }
}
