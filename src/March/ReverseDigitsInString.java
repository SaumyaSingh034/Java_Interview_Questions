package March;

public class ReverseDigitsInString {
    public static void main(String[] args){
        String input = "Hello123World456";
        reverseDigits(input);
    }

    private static void reverseDigits(String input) {
        StringBuilder letter = new StringBuilder();
        StringBuilder digits = new StringBuilder();

        for(char c : input.toCharArray()){
            if(Character.isDigit(c)){

                digits.append(c); //123
            }else {
                if(digits.length()>0){
                    letter.append(digits.reverse());
                    digits.setLength(0);
                }
                letter.append(c);
            }
        }
        if (digits.length() > 0) {
            letter.append(digits.reverse());
        }
        System.out.println(letter);

    }
}
