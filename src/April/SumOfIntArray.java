package April;

public class SumOfIntArray {
    public static void main(String[] args){
        String[] arr = {"1","2","3"};
        int sum = 0;
        for(String s : arr){
            sum += Integer.parseInt(s);
        }
        System.out.println(sum);
    }
}
