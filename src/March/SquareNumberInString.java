package March;

public class SquareNumberInString {
    public static void main(String[] args){
        String input = "code3test5run2";
        squareNumberInString(input);
    }

    private static void squareNumberInString(String input) {
        StringBuilder letter = new StringBuilder();
        StringBuilder digits = new StringBuilder();
        boolean isDigits = false;
        int product = 0;
        for(char c : input.toCharArray()){
            if(Character.isDigit(c)){
                int num = Character.getNumericValue(c);
                 product = num * num;
                 isDigits = true;
            }else{
                if(isDigits){
                    letter.append(product);
                    product = 0;
                    isDigits = false;
                }
                letter.append(c);
            }
        }
        letter.append(product);
        System.out.println(letter);
    }
}
