package test;

import java.util.Stack;

public class Question1 {
    public static void main(String[] args){
        String val = "{}{}()[]{}";
        balancedString(val);

    }

    private static void balancedString(String val) {
        int count = 0;
        char[] ch = val.toCharArray();
        Stack<Character> data = new Stack<>();
        for(char c : ch){
            data.add(c);
        }
    }
}
