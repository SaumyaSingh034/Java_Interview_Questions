package March;

public class SeparateLetterAndNumbers {
    public static void main(String[] args){
        String str = "hello12world34";
        //helloworld1234;
        separateletterAndNumbers(str);
    }

    private static void separateletterAndNumbers(String str) {
        StringBuilder letter = new StringBuilder();
        StringBuilder digits = new StringBuilder();
        for(char c : str.toCharArray()){
            if(Character.isDigit(c)){
                digits.append(c);
            }else if(Character.isLetter(c)){
                letter.append(c);
            }else{
                System.out.println("Special Character Found : "+c);
            }
        }
        letter.append(digits);
        System.out.println(letter);
    }
}
