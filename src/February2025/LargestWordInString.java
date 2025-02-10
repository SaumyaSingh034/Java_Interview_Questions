package February2025;

public class LargestWordInString {

    public static void main(String[] args){
        String str = "I love Java Coding and Python programming";
        largestWord(str);
    }

    private static void largestWord(String str) {
        int max = 0;
        String word = "";
        for(String s : str.split("\\s+")){
            if(max<s.length()){
                max = s.length();
                word = s;
            }
        }
        System.out.println(word);
    }
}
