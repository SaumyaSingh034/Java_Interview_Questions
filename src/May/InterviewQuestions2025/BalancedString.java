package May.InterviewQuestions2025;

public class BalancedString {
    public static void main(String[] args){
        String val = "{}{}()[]{}";
       System.out.println( balancedString(val));
    }

    private static boolean balancedString(String val) {
        int len = val.length();
        val = val.replace("()","");
        val = val.replace("[]","");
        val = val.replace("{}","");
        return val.trim().isEmpty();
    }
}
