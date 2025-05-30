package May;

public class ReverseWordsInString {
    public static void main(String[] args){
        String str = "I love coding in java";
        reverseWordsInString001(str);
    }

    private static void reverseWordsInString001(String str) {
        StringBuilder result = new StringBuilder();
        for(String s : str.split("\\s+")){
            StringBuilder word = new StringBuilder(s);
            result.append(word.reverse()).append(" ");
        }
        System.out.println(result.toString().trim());
    }
}
