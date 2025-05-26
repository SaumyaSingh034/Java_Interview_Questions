package CodingChallenge;

public class BalancedParenthesis {
    public static void main(String[] args){
        String str = "(){}[]";
        String str1 = "(]";
        String str2 = "({}[]";
        System.out.println(checkBalancedString(str));
        System.out.println(checkBalancedString(str1));
        System.out.println(checkBalancedString(str2));
    }

    private static boolean checkBalancedString(String str) {
        if(str.isEmpty())
            return false;
        else{
            str = str.replace("()","");
            str = str.replace("[]","");
            str = str.replace("{}","");
            return str.isEmpty();
        }
    }
}
