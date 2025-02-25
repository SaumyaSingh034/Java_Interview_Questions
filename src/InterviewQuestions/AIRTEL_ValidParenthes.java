package InterviewQuestions;

import java.util.Stack;

public class AIRTEL_ValidParenthes {
    public static void main(String[] args){
        String val = "{}{}()[]{}";
        System.out.println(isValid(val));

    }

    private static boolean isValid(String val) {
        Stack<Character> stack = new Stack<>();
        for(char c : val.toCharArray()){
            if(c=='(' || c == '{' || c== '['){
                stack.push(c);
            } else {
                if(stack.isEmpty()) return false;
                char open = stack.pop();
                if( c == ')' && open != '(') return false;
                if(c == '}' && open != '{') return  false;
                if(c == ']' && open != '[') return false;

            }
        }
        return stack.isEmpty();
    }
}
