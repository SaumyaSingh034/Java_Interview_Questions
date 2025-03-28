package March;

public class StringManipulation {
    public static void main(String[] args){
        String str = "MaYANK Is takING InterVIew";
        System.out.println(manipulateString(str));
    }

    private static String manipulateString(String str) {
        String[] words = str.split("\\s");
        StringBuilder result = new StringBuilder();
        for(String word : words){
            result.append(word.substring(0,1).toUpperCase()).append(
                    word.substring(1).toLowerCase()).append(" ");
        }
        return result.toString().trim();
    }
}
