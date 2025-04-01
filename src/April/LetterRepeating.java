package April;

public class LetterRepeating {
    public static void main(String[] args){
        String str = "abcd"; //aabbccdd//
        repeatLetters(str);
         }

    private static void repeatLetters(String str) {
        StringBuilder result = new StringBuilder();
        int num=0;
        for(char c : str.toCharArray()){
           for(int i=0;i<2;i++){
               result.append(c);
           }
        }
        System.out.println(result);
    }
}
