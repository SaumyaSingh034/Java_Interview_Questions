package February2025;

import java.util.HashMap;
import java.util.Map;

public class MaximumMinimumCharacter {
    public static void main(String[] args){
        String str = "saumyasumammm";
        printMaximumandMinimumChar(str);
    }

    private static void printMaximumandMinimumChar(String str) {
        Map<Character, Integer> dataMap = new HashMap<>();
        for(char c : str.toLowerCase().toCharArray()){
            dataMap.put(c, dataMap.getOrDefault(c, 0)+1);
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i : dataMap.values()){
            if(i>max){
                max = i;
            }
            if(i<min){
                min = i;
            }
        }

        for(Map.Entry<Character, Integer> entry : dataMap.entrySet()){
            if(entry.getValue() == min){
                System.out.println("Minimum Repeated Character : "+entry.getKey());
            }
            if(entry.getValue() == max){
                System.out.println("Maximum Repeated Character : "+entry.getKey());
            }
        }

    }
}
