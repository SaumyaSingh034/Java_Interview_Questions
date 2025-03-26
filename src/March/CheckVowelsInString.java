package March;

public class CheckVowelsInString {
    public static void main(String[] args ){
        String str = "Hello Saumya";
        String str1 = "Saum";
        String str2 = "ttytttttttttyyyty";
        checkVowelStringData(str);
        checkVowelStringData(str1);
        checkVowelStringData(str2);
    }

    private static void checkVowelStringData(String str) {
        if(str.length()>5 && containsVowel(str)){
            System.out.println("Success");
        } else if (str.length()<5) {
            System.out.println("Failure");
        } else{
            System.out.println("Failure");
        }
    }

    private static boolean containsVowel(String str) {
       for(char c : str.toLowerCase().toCharArray()){
           if("aeiouAEIOU".indexOf(c)!=-1)
               return true;
       }return false;
    }
}
