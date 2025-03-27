package March;

public class PatternPrint {
    public static void main(String[] args){
        String str = "SAUMYA";
        for(int i=str.length();i>=0;i--){
            System.out.println(str.substring(0,i));
        }

        System.out.println("*************************");
        for(int i=0;i<=str.length();i++){
            System.out.println(str.substring(0,i));
        }
    }
}
