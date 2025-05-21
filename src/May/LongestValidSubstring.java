package May;

public class LongestValidSubstring {
    public static void main(String[] args){
        String str = "baaabbabbb";
        longestValidSubstring2(str);

    }

    private static void longestValidSubstring2(String str) {
        int repeatCount=0;
        int cureentLength = 0;
        int maxLength = 0;
        for(int i=1;i<str.length();i++){
            if(str.charAt(i) == str.charAt(i-1))
                repeatCount++;
            else
                repeatCount = 1;
            if(repeatCount < 3)
                cureentLength++;
            else{
                cureentLength = 2;
                repeatCount = 2;
            }
            maxLength = Math.max(maxLength, cureentLength );

        }
        System.out.println(maxLength);
    }
}
