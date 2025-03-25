package March;

public class ReplaceNumberWithProduct {
    public static void main(String[] args){
        String input = "test245case";
        replaceNumberWithProduct(input);
    }

    private static void replaceNumberWithProduct(String input) {
        StringBuilder result = new StringBuilder();
        int product  =1;
        boolean isDigit = false;

        for(char c: input.toCharArray()){
            if(Character.isDigit(c)){
                int num = Character.getNumericValue(c);
                product = product * num;
                isDigit = true;
            }else{
                if(isDigit){
                    result.append(product);
                    product = 1;
                    isDigit = false;
                }
                result.append(c);
            }

        }
        System.out.println(result);
    }
}
