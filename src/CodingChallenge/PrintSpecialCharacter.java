package CodingChallenge;

public class PrintSpecialCharacter {
    public static void main(String[] args){
        String str = "ello@34%Wo$rld";
        printOnlySpecialCharacter(str);
    }

    private static void printOnlySpecialCharacter(String str) {
        StringBuilder special = new StringBuilder();
        for(char c : str.toCharArray()){
            if(!Character.isDigit(c) && !Character.isLetter(c))
                special.append(c);
        }
        System.out.println(special);
    }
}
