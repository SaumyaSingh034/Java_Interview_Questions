package April;

public class SumOfDigits {
    public static void main(String[] args){
        String str = " abcd23";
        sumOfDigits(str);
    }

    private static void sumOfDigits(String str) {
        int sum = 0;
        StringBuilder result = new StringBuilder();
       // boolean isNumeric = false;
        for(char c : str.toCharArray()){
            if(Character.isDigit(c)){
                sum += Character.getNumericValue(c);
            }else{
                result.append(c);
            }
        }
        result.append(sum);
        System.out.println(result);
    }
}
