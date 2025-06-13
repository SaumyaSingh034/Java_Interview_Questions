package June;

import java.util.Stack;

public class BalancedParentheses {
    public static void main(String[] args){
        String input = "(([]){})";
        System.out.println(checkValidParentheses(input));
    }

    private static boolean checkValidParentheses(String input) {
        Stack<Character> stack = new Stack<>();
        for(char c : input.toCharArray()){
            if(c =='(' || c == '{' || c == '[')
                stack.push(c);
            else{
                if(stack.isEmpty())
                    return false;
                char top = stack.pop();
                if((c ==')' && top !='(') ||
                (c == '}' && top != '{') ||
                        (c ==']' && top !='['))
                    return false;
            }
        }
        return stack.isEmpty();
    }
}
