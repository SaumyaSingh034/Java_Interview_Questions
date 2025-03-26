package March;

public class I_InterviewQuestions {
    public static void main(String[] args){
        String str = "I am Saumya Singh";
        reverseString(str);
    }

    private static void reverseString(String str) {
        String reverse = "";
        for(int i=str.length()-1;i>=0;i--){
            reverse += str.charAt(i);
        }
        System.out.println(reverse);
    }
}
