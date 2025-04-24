package April;

public class ReverseName {
    public static void main(String[] args){
        String str = "Saumya Singh";
        String result = "";
        for(int i=str.length()-1;i>=0;i--){
            result += str.charAt(i);
        }
        System.out.println(result);
    }
}
