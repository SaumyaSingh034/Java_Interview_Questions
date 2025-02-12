package February2025;

public class ReverseStringPreservingWitheSpaces {

    public static void main(String[] args){
        String str = "I love Java Programming";
        reverseStringPreserveWhitespaces(str);
    }

    private static void reverseStringPreserveWhitespaces(String str) {

        String[] arr = str.split(" ");
        StringBuilder result = new StringBuilder(str);
        result.reverse();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) ==' '){
                result.insert(i, ' ');
            }
        }

        System.out.println(result.toString());
    }
}
