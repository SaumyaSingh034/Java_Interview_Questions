package February2025;

public class VowelPresentOrNot {
    public static void main(String[] args){
        System.out.println(stringContainsVowels("Hello")); // true
        System.out.println(stringContainsVowels("TV")); // false

    }

    private static boolean stringContainsVowels(String str) {
        return str.toLowerCase().matches(".*[aeiou].*");
    }
}
