package Strings;

public class ValidParenthes {
    public static void main(String[] args){
        String str = "(){}[]";
        String str1 = "[({})]";
        System.out.println(isValid(str1));
    }

    private static boolean isValid(String str) {
        int len;
        len = str.length();
        str = str.replace("()","");
        str = str.replace("{}","");
        str = str.replace("[]","");
        return str.trim().isEmpty();


    }
}
