package May;

public class StringReverseWords {
    public static void main(String[] args){
        String str = "Test Automation";
        reverseEachWordAtPlace(str);
    }

    private static void reverseEachWordAtPlace(String str) {
        StringBuilder result = new StringBuilder();
        for(String s : str.split("\\s+")){
            StringBuilder word = new StringBuilder(s);
            result.append(word.reverse()).append(" ");
        }
        System.out.println(result.toString().trim());
    }
}
