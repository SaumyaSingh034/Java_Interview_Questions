package May.FactoryDesignPattern;

public class CountNumberOf1 {
    public static void main(String[] args){
        String str = "11011101111";
        longestSubstring4(str);
    }

    private static int longestSubstring4(String str) {
        int maxLen = 0;
        int currentLen = 0;
        for(char ch : str.toCharArray()){
            if(ch == '1'){
               currentLen++;
               maxLen = Math.max(currentLen, maxLen);
            }else{
                currentLen = 0;
            }
        }
        return maxLen;
    }
}
