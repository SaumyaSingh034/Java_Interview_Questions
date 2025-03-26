package March;

public class ReverseString {
    public static void main(String[] args){
        String str = "SDET";
        reverseStringWithoutInBuilt(str);
    }

    private static void reverseStringWithoutInBuilt(String str) {
        String reverse = "";
        for(int i = str.length()-1;i>=0;i--){
            reverse += str.charAt(i);
        }
        System.out.println(reverse);
    }
}
