package Strings;

public class CustomizedReverseString {
    public static void main(String[] args){
        String str = "I LOVE JAVA";
        customizedReverese(str);
    }

    private static void customizedReverese(String str) {
        StringBuffer result  = new StringBuffer();
        for(String s : str.split("\\s+")){
            result.append(s);
        }
        result.reverse();

        for(int i=0;i<str.length();i++){
            if(str.charAt(i)== ' '){
                result.insert(i, ' ');
            }
        }
        System.out.println(result);
    }
}
