package May.InterviewQuestions2025;

public class PS_01 {
    public static void main(String[] args){
        String str = "a2b3c4d";
        printExpandedString(str);
    }

    private static void printExpandedString(String str) {
        StringBuilder result = new StringBuilder();
        char[] ch = str.toCharArray();
        for(int i=0;i< ch.length;i++){
            if(Character.isDigit(ch[i])){
                int k = i-1;
                char c = ch[k];
                int digit = Character.getNumericValue(ch[i]);
                for(int j=0;j<digit-1;j++){
                    result.append(c);
                }
            }else{
                result.append(ch[i]);
            }
        }
        System.out.println(result);

    }
}
