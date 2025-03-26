package March;

public class FindMissingNumber {
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 5}; // Missing number is 4
        System.out.println("Missing Number: " + findMissingNumber(arr, 5));
    }

    private static int findMissingNumber(int[] arr, int i) {
        int totalSum = i * (i + 1)/2;
        int arraySum = 0;
        for(int k : arr){
            arraySum += k;
        }
        return totalSum-arraySum;
    }
}
