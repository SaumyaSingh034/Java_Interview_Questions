package April;

public class ReverseWordsInString {
    public static void main(String[] args){
        String input = "Try Coding";
        reverseWordsInString(input);
    }

    private static void reverseWordsInString(String input) {
        StringBuilder result = new StringBuilder();
        for(String word : input.split("\\s")){
            StringBuilder reverse = new StringBuilder(word);
            result.append(reverse.reverse()).append(" ");
        }
        System.out.println(result.toString().trim());
    }
}
