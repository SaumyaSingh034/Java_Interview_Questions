package CodingChallenge;

public class ExpandString {
    public static void main(String[] args){
        String str = "a2b3c1";
        expandCustomizedString(str);
    }

    private static void expandCustomizedString(String str) {
        StringBuilder result = new StringBuilder();
        char[] ch = str.toCharArray();
        for(int i=1;i< ch.length;i++){
            if(Character.isDigit(ch[i])){
                int digit = Character.getNumericValue(ch[i]);
                for(int j=0;j<digit;j++)
                    result.append(ch[i-1]);

            }


        }
        System.out.println(result);
    }
}
