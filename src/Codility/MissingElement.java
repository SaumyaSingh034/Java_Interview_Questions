package Codility;

public class MissingElement {
    public static void main(String[] args){
        int[] arr = {1,2,3,5};
        System.out.println(findMissingElement(arr));
    }

    private static int findMissingElement(int[] arr) {
        int n = arr.length;
        long expectedSum = (long) (n + 1) * (n+2)/2;
        long actualSum = 0;
        for(int i : arr){
            actualSum +=i;
        }
        return (int) (expectedSum-actualSum);
    }
}
