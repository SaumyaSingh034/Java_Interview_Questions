package Codility;

public class NestedString {
    public static void main(String[] args){
        String str = "(()(())())";
       System.out.println( nestedString(str));
    }

    private static int nestedString(String S) {
        int open = 0;
        for(char c : S.toCharArray()){
            if(c=='(')
                open++;
            else if (c == ')') {
                if(open ==0)
                    return 0;
                open--;

            }
        }
        return open == 0 ? 1 : 0;
    }
}
