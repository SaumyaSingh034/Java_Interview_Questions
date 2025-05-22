package May.FactoryDesignPattern;

public class LVSubstring {
    public static void main(String[] args){
        String str = "baaabbabbb";
        lvSubstring(str);
    }

    private static int lvSubstring(String str) {
        int maxLength = 0;
        int repeatedCount=0;
        int currentLength = 0;

        if(str == null || str.length() == 0)
            return 0;
        for(int i=1;i<str.length();i++){
            if(str.charAt(i) == str.charAt(i-1)){
                repeatedCount++;
            }else{
                repeatedCount = 1;
            }
            if(repeatedCount < 3){
                currentLength++;
            }else{
                currentLength = 2;
                repeatedCount= 2;
            }
            maxLength = Math.max(currentLength, maxLength);
        }
        System.out.println(maxLength);
        return maxLength;
    }

}
