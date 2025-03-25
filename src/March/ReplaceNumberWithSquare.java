package March;

public class ReplaceNumberWithSquare {
    public static void main(String[] args){
        String input = "code3test5run2";
        replaceNumberWithSquare(input);
    }

    private static void replaceNumberWithSquare(String input) {
        StringBuilder letter = new StringBuilder();
        int number;
        for(char c : input.toCharArray()){
            if(Character.isDigit(c)){
                number = Character.getNumericValue(c);
                number = number * number;
                letter.append(number);
            } else if (Character.isLetter(c)) {
                letter.append(c);
            }
        }
        System.out.println(letter);
    }
}
