package Strings;

public class PermutationOfSTring {
    public static void main(String[] args){
        String str = "ABC";
        int len = str.length();
        generatePermutations(str, 0,len);
    }

    private static void generatePermutations(String str, int start, int end) {
        if(start == end-1)
            System.out.println(str);
        else{
            for(int i=start;i<end;i++){
                str = swapString(str,start,i);
                generatePermutations(str, start+1,end);
                str = swapString(str,start,i);
            }
        }
    }

    private static String swapString(String str, int start, int i) {
        char[] b = str.toCharArray();
        char ch;
        ch = b[start];
        b[start] = b[i];
        b[i] = ch;
        return String.valueOf(b);

    }
}
