package CodingChallenge;

public class ReserveStringPreservingPosition {
    public static void main(String[] args){
        String str = "Hi Welcome"; //O/P-> iH emocleW
        resrverStringPreservingItsPosition(str);
    }

    private static void resrverStringPreservingItsPosition(String str) {
        StringBuilder result = new StringBuilder();
        for(String s : str.split("\\s+")){
            StringBuilder word = new StringBuilder(s);
            result.append(word.reverse()).append(" ");
        }
        System.out.println(result.toString().trim());
    }
}
