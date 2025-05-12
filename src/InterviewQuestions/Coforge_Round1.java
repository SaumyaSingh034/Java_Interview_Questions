package InterviewQuestions;

public class Coforge_Round1 {
    public static void main(String[] args){
        String str = "Saumya123";
        countLettersAndDigitsInString(str);
    }

    private static void countLettersAndDigitsInString(String str) {
        int letter = 0;
        int digit = 0;
        for(Character c : str.toCharArray()){
            if(Character.isDigit(c))
                digit++;
            else if (Character.isLetter(c)) {
                letter++;

            }
        }
        System.out.println("Letters in String are : "+letter+" Digits in String are : "+digit);
    }
}
