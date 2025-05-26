package CodingChallenge;

public class ValidPalindrome {
    public static void main(String[] args){
        String str = "A man, a plan, a canal: Panama";
        validPalindrom(str);
    }

    private static void validPalindrom(String str) {
        str = str.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        System.out.println(str);
        StringBuilder reverse = new StringBuilder(str);
        String result = reverse.reverse().toString();
       System.out.println(result);
       System.out.println(str);
       System.out.println(str.equals(result));
    }
}
