package InterviewQuestions;

public class IRIS_Question1 {
    public static void main(String[] args){
        String str = "0000012350609";
        removeTrailingZero(str);
    }

    private static void removeTrailingZero(String str) {
        char[] ch = str.toCharArray();
        int index = 0;
        for(int i=0;i< ch.length;i++){
            if(ch[i]!='0'){
                index = i;
                break;
            }
        }
        System.out.println(str.substring(index));
    }
}
