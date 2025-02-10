package February2025;

public class ReverseEachWordInString {
    public static void main(String[] args){
        String str = "payal shirish mehta";
        reverseEachWordInString(str);
    }

    private static void reverseEachWordInString(String str) {
        StringBuffer result = new StringBuffer();
        for(String s : str.split("\\s+")){
            StringBuffer sB = new StringBuffer(s);
            result.append(sB.reverse()).append(" ");
        }
        System.out.println(result.toString().trim());
    }
}
