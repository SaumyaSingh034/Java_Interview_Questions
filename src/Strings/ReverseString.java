package Strings;

public class ReverseString {
    public static void main(String[] args){
        String str = "My name is Saumya";
        reverseString(str);
    }

    private static void reverseString(String str) {
        StringBuffer sb = new StringBuffer();
        String[] words = str.split("\\s+");
        for(int i = words.length-1;i>=0;i-- ){
            sb.append(words[i]).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}
