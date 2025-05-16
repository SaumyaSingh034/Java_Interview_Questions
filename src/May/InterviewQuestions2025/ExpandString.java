package May.InterviewQuestions2025;

public class ExpandString {
    public static void main(String[] args){
        String str = "a2b3c1";
        decodeString(str);
        decodeStringOptimized(str);
    }

    private static void decodeStringOptimized(String str) {
        StringBuilder result = new StringBuilder();
        for(int i=0;i<str.length();i+=2){
            char ch = str.charAt(i);
            int count = Character.getNumericValue(str.charAt(i+1));
            result.append(String.valueOf(ch).repeat(count));

        }
        System.out.println(result);
    }

    private static void decodeString(String str) {
        StringBuilder result = new StringBuilder();
        int digit=0;
        char[] ch = str.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(Character.isLetter(ch[i])){
                result.append(ch[i]);
            } else if (Character.isDigit(ch[i])) {
                digit = Character.getNumericValue(ch[i]);
                for(int j = 1;j<digit;j++){
                    result.append(ch[i-1]);
                }

            }
        }
        System.out.println(result);
    }
}
