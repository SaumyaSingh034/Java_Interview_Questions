package March;

public class ReverseBetweenDigits {
    public static void main(String[] args){
        String input = "34test909gda@sdet123pro";
        reverseBetweenDigits(input);
    }

    private static void reverseBetweenDigits(String input) {
        StringBuilder digits = new StringBuilder();
        StringBuilder temp = new StringBuilder();
        for(char c : input.toCharArray()){
            if(Character.isDigit(c)){
                digits.append(temp.reverse());
                temp.setLength(0);
                digits.append(c);
            }else{
                temp.append(c);
            }
        }
        digits.append(temp.reverse());
        System.out.println(digits);
    }
}
