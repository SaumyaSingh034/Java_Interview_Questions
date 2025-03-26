package March;

public class ExtractSumInString {
    public static void main(String[] args){
        String input = "Automation1234testing";
       System.out.println( transformString(input));
    }

    public static String transformString(String input) {
        StringBuilder firstWord = new StringBuilder();
        StringBuilder remaining = new StringBuilder();
        int sum = 0;
        boolean numberFound = false;

        for (char ch : input.toCharArray()) {
            if (Character.isDigit(ch)) {
                sum += Character.getNumericValue(ch); // Summing digits
                numberFound = true;
            } else {
                if (numberFound) {
                    remaining.append(ch); // Append to remaining part after number
                } else {
                    firstWord.append(ch); // Append to first word before number
                }
            }
        }

        // Append sum to the first word and join with remaining part
        return firstWord.append(sum).append(remaining).toString();
    }
}
