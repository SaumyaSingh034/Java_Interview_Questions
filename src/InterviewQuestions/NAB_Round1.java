package InterviewQuestions;

public class NAB_Round1 {
    public static void main(String[] args){
        String str = "This is a sunny day";
        //Reverse String preserving whitespaces
        reverseStringPreserving(str);
    }

    private static void reverseStringPreserving(String str) {

        String str1 = str.replaceAll(" ","");
        StringBuilder result = new StringBuilder(str1);
        result.reverse();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == ' ') {
                result.insert(i, ' ');
            }
        }
        System.out.println(result);

    }
}
