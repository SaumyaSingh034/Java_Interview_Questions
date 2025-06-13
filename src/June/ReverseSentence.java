package June;

public class ReverseSentence {
    public static void main(String[] args){
        String str = "Java is fun";
        revsreStringJustWords(str);

    }

    private static void revsreStringJustWords(String str) {
        StringBuilder result = new StringBuilder();
        String[] s = str.split("\\s+");
        for(int i=s.length-1;i>=0;i--){
            result.append(s[i]).append(" ");
        }
        System.out.println(result.toString().trim());
    }
}
