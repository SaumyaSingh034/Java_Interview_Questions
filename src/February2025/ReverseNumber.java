package February2025;

public class ReverseNumber {
    public static void main(String[] args){
        int number = 45321;
        System.out.println(reverseNumber(number));
    }

    private static int reverseNumber(int number) {
        int revNum = 0;
        while(number>0){
            revNum = revNum*10+ number%10;
            number = number/10;

        }
        return revNum;
    }
}
