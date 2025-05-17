package May;

public class GeneratePermutation {
    public static void main(String[] args){
        String str = "XYZ";
        generatePermutation(str, "");
    }

    private static void generatePermutation(String str, String result) {
        if(str.length() == 0)
            System.out.println(result);

        for(int i = 0;i<str.length();i++){
            char c = str.charAt(i);
            String remaining = str.substring(0,i)+str.substring(i+1);
            generatePermutation(remaining, result+c);
        }
    }
}
