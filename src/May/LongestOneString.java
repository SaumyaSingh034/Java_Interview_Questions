package May;

public class LongestOneString
{
    public static void main(String[] args){
        String input = "11011101111";
        maxLengthOfOnes(input);
    }

    private static void maxLengthOfOnes(String input) {
        int maxLength = 0;
        int currentLen = 0;
        for(char ch : input.toCharArray()){
            if(ch == '1'){
                currentLen++;
                maxLength = Math.max(currentLen, maxLength);
            }else
                currentLen = 0;
        }
        System.out.println(maxLength);
    }
}
