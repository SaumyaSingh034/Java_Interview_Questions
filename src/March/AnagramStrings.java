package March;

import java.util.Arrays;

public class AnagramStrings {
    public static void main(String[] args) {
        System.out.println(isAnagramMarch("listen", "silent")); // true
        System.out.println(isAnagramMarch("hello", "world"));   // false
    }

    private static boolean isAnagramMarch(String str1, String str2) {
        if(str1.length()!=str2.length())
            return false;
        else {
            char[] ch1 = str1.toLowerCase().toCharArray();
            char[] ch2 = str2.toLowerCase().toCharArray();

            Arrays.sort(ch1);
            Arrays.sort(ch2);

            return Arrays.equals(ch1, ch2);

        }
    }
}
