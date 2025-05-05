package May;

public class Palindrome {
    public static void main(String[] args){
        int number = 891;

        System.out.println(isPalindrome(number));
    }

    private static boolean isPalindrome(int number) {
        int reverse = 0;
        int original = number;

        while(number!=0){
            int digit = number%10;
            reverse = reverse * 10 +digit;
            number = number/10;
        }
        return original == reverse;
    }
}
