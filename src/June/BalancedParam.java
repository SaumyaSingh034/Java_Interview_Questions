package June;

import java.util.Stack;

public class BalancedParam {
    public static void main(String[] args0){
        String str = "(([]){})";
        System.out.println(checkedBalanceParam(str));}

    private static boolean checkedBalanceParam(String str) {
        Stack<Character> stack = new Stack<>();
        for(char c : str.toCharArray()){
            if(c == '(' || c == '{' || c == '[')
                stack.push(c);
            else{
                if(stack.isEmpty())
                    return false;
                char top = stack.pop();
                if((c == ')' && top != '(') || (c =='}' && top != '{') || (c == ']' && top != '['))
                    return false;
            }
        }
        return stack.isEmpty();
    }
}
