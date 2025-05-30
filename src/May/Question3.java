package May;

public class Question3 {
    public static void main(String[] args){
        String str = "1100111110111";
        largestLength(str);
    }

    private static void largestLength(String str) {
        int count = 0;
        int maxLength = 0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == '1') {
                count++;
                maxLength = Math.max(maxLength, count);
            }

            else count=0;
        }
        System.out.println(maxLength);
    }
}
