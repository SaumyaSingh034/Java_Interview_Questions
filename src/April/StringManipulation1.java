package April;

public class StringManipulation1 {
    public static void main(String[] args){
        String input = "MyNameIsSaumya";
        manipulateString1(input);
    }

    private static void manipulateString1(String input) {
        StringBuilder result = new StringBuilder();
        char[] ch = input.toCharArray();
        for(char c : input.toCharArray()){
            if(Character.isUpperCase(c) && result.length() > 0){
                result.append('_');

            }
            result.append(c);
        }
        System.out.println(result);
    }
}
