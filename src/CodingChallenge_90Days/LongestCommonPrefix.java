package CodingChallenge_90Days;

public class LongestCommonPrefix {
    public static void main(String[] args){
        String[] str = {"automation", "auto", "autonomous"};
        System.out.println(findLongestCommonPrefix(str));
    }

    private static String findLongestCommonPrefix(String[] str) {
        String prefix = str[0];
        for(String word : str){
            while(!word.startsWith(prefix)){
                prefix = prefix.substring(0,prefix.length()-1);
                if(prefix.isEmpty()) return " ";
            }
        }
        return prefix;
    }
}
