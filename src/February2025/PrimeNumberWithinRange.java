package February2025;

public class PrimeNumberWithinRange {
    public static void main(String[] args){
        generatePrimeNumberWithInRange(1,4);
        generatePrimeNumberWithInRange(1,10);

    }

    private static void generatePrimeNumberWithInRange(int num1, int num2) {
        for(int i=num1; i<=num2;i++ ){
            if(i==0 || i==1){
                System.out.print(i+" ");
            }else if(i%2 !=0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
}
