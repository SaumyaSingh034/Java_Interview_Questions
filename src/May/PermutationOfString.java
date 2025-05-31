package May;

public class PermutationOfString {
    public static void main(String[] args){
        String str = "ABC";
       // permuteStr001("", str);
        permuteStr002("", str);
    }

    private static void permuteStr002(String s, String str) {
        if(str.isEmpty()){
            System.out.println(s);
        }else{
            for(int i=0;i<str.length();i++){
                permuteStr002(s+str.charAt(i), str.substring(0,i)+str.substring(i+1));
            }
        }
    }

    private static void permuteStr001(String prefix, String str) {
        String result = "";
        if(str.isEmpty())
            System.out.println(prefix);
        else{
            for(int i=0;i<str.length();i++){
                permuteStr001(prefix+str.charAt(i), str.substring(0,i)+str.substring(i+1));
            }
        }
    }
}
