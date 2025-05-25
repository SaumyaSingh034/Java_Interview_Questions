package CodingChallenge;

public class FactorialNumber {
    public static void main(String[] args){
        int num = 5;
        factorialProgram(num);
    }

    private static void factorialProgram(int num) {
        int factorial =1;
        for(int i=1;i<=num;i++){
            factorial = factorial * i;
        }
        System.out.println(factorial);
    }
}
