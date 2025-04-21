package April;

public class ReverseStr {
    public static void main(String[] args){
        String str = "Automation";
        reverseString(str);
    }

    private static void reverseString(String str) {
        String result = "";
        for(int i = str.length()-1;i>=0;i--){
            result += str.charAt(i);
        }
        System.out.println(result);
    }
}
