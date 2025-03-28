package InterviewQuestions;

public class PS_CustomizedString {
    public static void main(String[] args){
        String s = "a2b3c6";
        customizedString(s);

    }

    private static void customizedString(String s) {
        StringBuilder str = new StringBuilder();
        char[] ch = s.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(Character.isDigit(ch[i])){
                int k = i-1;
               int num = Character.getNumericValue(ch[i]);
               for(int j=1;j<num;j++){
                   str.append(ch[k]);
               }
            }else{
                str.append(ch[i]);
            }
        }
        System.out.println(str);
    }
}
