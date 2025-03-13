package CodingChallenge_90Days;

public class CountCharacterOccurence {
    public static void main(String[] args){
        String str = "automation";
        char c = 'a';
       CharCount counter = (s,ch) -> (int) str.chars().filter(x -> x == c).count();
       System.out.println(counter.count(str, c));
    }



    @FunctionalInterface
    interface CharCount{
        int count(String s, char c);
    }
}
