package CodingChallenge;

public class FibonacciSeries {
    public static void main(String[] args){
        int num = 5;
        fibonacciNumber(num);

    }

    private static void fibonacciNumber(int num) {
        int a = 0;
        int b = 1;
        int sum = 0;
        for(int i=0;i<num;i++){
            System.out.print(a+" ");
            sum = a+b;
            a = b;
            b = sum;

        }
    }
}
