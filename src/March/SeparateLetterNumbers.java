package March;

public class SeparateLetterNumbers {
    public static void main(String[] args){
        String input = "hello12world34";
        String input1 = "hello12@76*&&^988world34";
        System.out.println(seprateLetterNumber(input1));
    }

    private static String seprateLetterNumber(String input) {
        StringBuilder letter = new StringBuilder();
        StringBuilder digits = new StringBuilder();
        int count=0;
        for(char c : input.toCharArray()){
            if(Character.isDigit(c)){
                digits.append(c);
            }else if(Character.isLetter(c)){
                letter.append(c);
            }else{
                System.out.println("Special Character : "+c);
                count++;
            }
        }
        System.out.println("Special Character Found: "+count);
        return letter.append(digits).toString().trim();
    }
}
