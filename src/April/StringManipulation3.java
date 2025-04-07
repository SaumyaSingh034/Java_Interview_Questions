package April;

public class StringManipulation3 {
    public static void main(String[] args){
        String str = "I Love Java";
        reverseString1(str);
        reverseEntireString1(str);
    }

    private static void reverseEntireString1(String str) {
        StringBuilder result  = new StringBuilder();
        String[] words = str.split("\\s");
        for(int i= words.length-1;i>=0;i--){
            StringBuilder word = new StringBuilder(words[i]);
            result.append(word.reverse()).append(" ");
        }
        System.out.println(result.toString().trim());
    }

    private static void reverseString1(String str) {
        StringBuilder result = new StringBuilder();
        String[] words = str.split("\\s");
        for(int i=words.length-1;i>=0;i--){
            result.append(words[i]).append(" ");
        }
        System.out.println(result.toString().trim());
    }
}
