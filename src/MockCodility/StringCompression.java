package MockCodility;

import java.util.HashMap;
import java.util.Map;

public class StringCompression {

    public static String compress(String input) {
        // implement compression
        if (input == null || input.isEmpty()) return "";
        Map<Character, Integer> compress = new HashMap<>();
        StringBuilder result = new StringBuilder();
        for(char c : input.toCharArray()){
            compress.put(c, compress.getOrDefault(c,0)+1);
        }

        for(Map.Entry<Character, Integer> data : compress.entrySet()){
            result.append(data.getKey()).append(data.getValue());
        }

        return result.toString();

    }

    public static String decompress(String input) {
        // implement decompression
        StringBuilder result = new StringBuilder();
        char[] ch = input.toCharArray();
        int digit;
        for(int i=1;i< ch.length;i++){
            if(Character.isDigit(ch[i])){
                digit = Character.getNumericValue(ch[i]);
                for(int j=0;j<digit;j++)
                    result.append(ch[i-1]);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(compress("abcabc")); // a3b3c1
        System.out.println(decompress("a3b3c1")); // aaabbbc
    }
}