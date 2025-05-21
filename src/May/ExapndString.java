package May;

public class ExapndString {
    public static void main(String[] args){
        String str = "a2b3c4";
        expandString(str);
    }

    private static void expandString(String str) {
        StringBuilder result = new StringBuilder();
        int digits;
        char[] ch = str.toCharArray();
        for(int i=0;i< ch.length;i++){
            if (Character.isDigit(ch[i])){
                 digits = Character.getNumericValue(ch[i]);
                 for(int j=0;j<digits;j++){
                     result.append(ch[i-1]);
                 }
            }
        }
        System.out.println(result);
    }
}
