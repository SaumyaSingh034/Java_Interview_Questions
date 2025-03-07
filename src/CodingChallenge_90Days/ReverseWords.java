package CodingChallenge_90Days;

public class ReverseWords {
    public static void main(String[] args){
        String str = "SDET Interview are tricky";
        reverseString(str);
    }

    private static void reverseString(String str) {
        StringBuffer result = new StringBuffer();
        String[] words = str.split("\\s");
        for(int i= words.length-1;i>=0;i--){
            result.append(words[i]).append(" ");
        }
        System.out.println(result.toString().trim());
    }
}
