package May;

public class PrintSpecialCharacters {
    public static void main(String[] args){
        String str = "hello@34%Wo$rld";
        printSpecialCharacetr(str);
        String result = str.replaceAll("[a-zA-Z0-9]","");
        System.out.println(result);
    }

    private static void printSpecialCharacetr(String str) {
        StringBuilder result = new StringBuilder();
        for(char c : str.toCharArray()){
            if(!Character.isLetter(c) && !Character.isDigit(c)){
                result.append(c);
            }
        }
        System.out.println(result);
    }
}
