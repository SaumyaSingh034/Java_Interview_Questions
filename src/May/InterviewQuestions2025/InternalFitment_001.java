package May.InterviewQuestions2025;

public class InternalFitment_001 {
    public static void main(String[] args){
        String str = "SAUMYA";
        for(int i=str.length();i>=0;i--){
            System.out.println(str.substring(0, i));
        }
    }
}
