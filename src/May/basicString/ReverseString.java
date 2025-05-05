package May.basicString;

public class ReverseString {
    public static void main(String[] args){
        String str = "Saumya Singh";
        String revsre = "";
        for(int i = str.length()-1; i>=0; i--){
            revsre = revsre+str.charAt(i);
        }

        System.out.println(revsre);
    }
}
