package March;

public class RemoveSpecialCharacter {
    public static void main(String[] args){
        String str = "Test$123.QA";
        replaceSpecialCharWithSpace(str);
    }

    private static void replaceSpecialCharWithSpace(String str) {
        StringBuilder result = new StringBuilder();
        for(Character c : str.toCharArray()){
            if(Character.isLetter(c) || Character.isDigit(c))
                result.append(c);
            else {
                result.append(' ');
            }
        }
        System.out.println(result.toString().trim());
    }
}