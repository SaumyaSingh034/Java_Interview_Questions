package May;

import java.util.Stack;

public class BalancedParenthes {
    public static void main(String[] args){
        String str = "(){}[](())";
        System.out.println(validParan(str));
    }

    private static boolean validParan(String str) {
        Stack<Character> stack = new Stack<>();
        for(char c : str.toCharArray()){
            if(c == '(' || c =='{' || c=='[')
                stack.push(c);
            else {
                if (stack.isEmpty())
                    return false;
                char top = stack.pop();
                if((c == ')' && top !='(')  || (c=='}' && top != '{' )||( c==']' && top !='['))
                    return false;
            }

        }
        return stack.isEmpty();
    }
}
