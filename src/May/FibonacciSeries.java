package May;

public class FibonacciSeries {
    public static void main(String[] args){
        int a = 0;
        int b=1;
        int sum = 0;

        for(int i=0;i<=5;i++){
            System.out.print(a+" ");
            sum = a+b;
            a = b;
            b= sum;
        }
    }
}
