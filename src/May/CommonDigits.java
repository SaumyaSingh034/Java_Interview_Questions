package May;

public class CommonDigits {
    public static void main(String[] args){
        int num1 = 366;
        int num2 = 665;

        printCommonDigit(num1, num2);
    }

    private static void printCommonDigit(int num1, int num2) {
        String str1 = String.valueOf(num1);
        String str2 = String.valueOf(num2);

        for(int i=0;i< str1.length();i++){
            char ch = str1.charAt(i);
            if(str2.indexOf(ch)!= -1){
                System.out.println(ch+" ");
            }
        }
    }
}
