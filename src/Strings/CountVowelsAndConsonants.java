package Strings;

public class CountVowelsAndConsonants {
    public static void main(String[] args) {
        String str = "Hello this sentance may contain vowels and consonants";
        countVowels(str);
    }

    private static void countVowels(String str) {
        int vowel = 0;
        int consonant = 0;
        for (Character ch : str.toCharArray()) {
            if(!Character.isWhitespace(ch) && ch == 'a' ||
            ch == 'e' || ch == 'i' || ch == 'o'
            || ch == 'u'){
                vowel++;
            }else{
                consonant++;
            }

        }

        System.out.println(vowel + "    ----     " + consonant);

    }
}
