package March;

public class I_CustomisezString {
    public static void main(String[] args){
        String input = "34test909gda@sdet123pro";
        reverseOnlyString(input);
    }

    private static void reverseOnlyString(String input) {
        StringBuilder letter = new StringBuilder();
        StringBuilder result = new StringBuilder();
        StringBuilder digits = new StringBuilder();
        StringBuilder specialChar = new StringBuilder();
        boolean digitsFound = false;
        boolean special = false;
        boolean letterD = false;

        for(char c : input.toCharArray()){
            if(Character.isDigit(c)){
                result.append(letter.reverse());
                letter.setLength(0);
                result.append(c);
            }else{
                letter.append(c);
            }


        }
        result.append(letter.reverse());
        System.out.println(result);


       // letter.setLength(0);
    }
}
