package March;

public class ReverseAlternative {
    public static void main(String[] args){
        String str = "selenium cypress playwright webdriverio";
        reverseAlternateWords(str);
    }

    private static void reverseAlternateWords(String str) {
        StringBuilder result = new StringBuilder();
        String[] words = str.split("\\s");
        for(int i=0;i<words.length;i++){
            if(i%2!=0){
                StringBuilder data = new StringBuilder(words[i]);
                result.append(data.reverse()).append(" ");
            }else{
                result.append(words[i]).append(" ");
            }
        }
        System.out.println(result.toString().trim());
    }
}
