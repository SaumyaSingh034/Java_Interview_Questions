package February2025;

public class SmallestWordInString {
    public static void main(String[] args) {
        String str = "I love Java Coding and Python programming";
        smallestWord(str);


    }

    private static void smallestWord(String str) {
        int min = str.length();
        String word = "";
        for(String s : str.split("\\s+")){
            if(min>s.length()){
                min = s.length();
                word = s;
            }
        }
        System.out.println(word);
    }
}
