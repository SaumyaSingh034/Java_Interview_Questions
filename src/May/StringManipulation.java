package May;

public class StringManipulation {
    public static void main(String[] args){
        String str = "This is a Java Program";
        manipulateStringDeloitte(str);
    }

    private static void manipulateStringDeloitte(String str) {
        StringBuilder withoutSpaces = new StringBuilder(str.replaceAll(" ",""));
        System.out.println(withoutSpaces.reverse());
        for(int i=0;i<str.length();i++){

        }
    }
}
