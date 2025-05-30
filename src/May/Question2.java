package May;

public class Question2 {
    public static void main(String[] args){
        String str = "baaabbabbb";
        longestSubstringThreeConseqtive(str);
        longestSubstringThreeConseqtive3(str);
    }

    private static void longestSubstringThreeConseqtive3(String str) {
        int maxLength = 0;
        int repeatCount = 0;
        int currentLength = 0;
        for(int i=1;i<str.length();i++){
            if(str.charAt(i) == str.charAt(i-1))
                repeatCount++;
            else
                repeatCount = 1;
            if(repeatCount < 3)
                currentLength++;
            else{
                currentLength = 2;
                repeatCount = 2;
            }
            maxLength = Math.max(maxLength, currentLength);
        }
       System.out.println(maxLength);
       System.out.println(str.substring(currentLength, maxLength));
    }

    private static void longestSubstringThreeConseqtive(String str) {
        int repeatCount = 0;
        int maxCount = 0;
        int currentCount = 0;
        for(int i=1;i<str.length();i++){
            if(str.charAt(i) == str.charAt(i-1))
                repeatCount++;
            else
                repeatCount = 1;
            if(repeatCount < 3){
                currentCount++;
            }else{
                currentCount = 2;
                repeatCount = 2;
            }
            maxCount = Math.max(maxCount, currentCount);

        }
        System.out.println(maxCount);

    }
}
