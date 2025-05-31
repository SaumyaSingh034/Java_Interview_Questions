package May;

public class Question5 {
    public static void main(String[] args){
        String str = "baaabbabbb";
        fingLongestString001(str);
    }

    private static void fingLongestString001(String str) {
        int maxLength = 0;
        int repeatedCount = 0;
        int maxStart = 0;
        int start=0;
        for(int i=1;i<str.length();i++){
            if(str.charAt(i) == str.charAt(i-1))
                repeatedCount++;
            else
                repeatedCount = 1;
            if(repeatedCount == 3){
                start = i-1;
                repeatedCount = 2;
            }
            if(i-start+1>maxLength){
                maxLength = i-start+1;
                maxStart = start;

            }

        }
        System.out.println(str.substring(maxStart, maxStart+maxLength));
    }
}
