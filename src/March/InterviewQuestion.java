package March;

public class InterviewQuestion {
    public static void main(String[] args){

        String input = "34test909gda@sdet123pro";
        reverseOnlyStringCustomized(input);
    }

    private static void reverseOnlyStringCustomized(String input) {
        StringBuilder result = new StringBuilder();
        StringBuilder digits = new StringBuilder();

        for(char c : input.toCharArray()){
            if(Character.isDigit(c)){
                digits.append(result.reverse());
                result.setLength(0);
                digits.append(c);
            }else{
                result.append(c);
            }
        }
        digits.append(result.reverse());
        System.out.println(digits);
    }
}
