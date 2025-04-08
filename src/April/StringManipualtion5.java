package April;

public class StringManipualtion5 {
    public static void main(String[] args){
        String input = "Automation 1234testing";
        manipulateStringwithSum(input);
    }

    private static void manipulateStringwithSum(String input) {
        StringBuilder letter = new StringBuilder();
        boolean isDigits = false;
        int sum = 0;

        for(char c : input.toLowerCase().toCharArray()){
            if(Character.isDigit(c)){
                sum += Character.getNumericValue(c);
                isDigits = true;
            }else if(isDigits){
                letter.append(sum);
                letter.append(c);
                isDigits = false;
            }else{
                letter.append(c);
            }
        }
        System.out.println(letter);
    }
}
