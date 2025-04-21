package April;

public class StringPalindromeEdgeCases {
    public static void main(String[] args){
        String str = "A man a plan a canal Panama";
        isPlaindrome(str);
    }

    private static boolean isPlaindrome(String str) {
        str = str.replaceAll("\\s+","").toLowerCase();
        return str.equals(new StringBuilder(str).reverse().toString());
    }
}
