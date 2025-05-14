package March;

public class SecondHighestElement {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,6,7};
        findSecondLargestElement(arr);
    }

    private static void findSecondLargestElement(int[] arr) {
        int max = Integer.MIN_VALUE;
        int sMax = Integer.MIN_VALUE;

        for(int i : arr){
            if(i>max){
                sMax = max;
                max = i;
            } else if (i>sMax && i<max) {
                sMax = i;
            }
        }
        System.out.println(max);
        System.out.println(sMax);
    }
}
