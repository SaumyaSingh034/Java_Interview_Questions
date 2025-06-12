package June;

public class DecodeString {
    public static void main(String[] args){
        String str = "a2b3c1";
        decodeString1(str);
    }

    private static void decodeString1(String str) {
        StringBuilder result = new StringBuilder();
        int digit;
        for(int i=1;i<str.length();i=i+2){
            if(Character.isDigit(str.charAt(i))){
                digit = Character.getNumericValue(str.charAt(i));
                for(int j=0;j<digit;j++)
                    result.append(str.charAt(i-1));
            }
        }
        System.out.println(result);
    }
}
