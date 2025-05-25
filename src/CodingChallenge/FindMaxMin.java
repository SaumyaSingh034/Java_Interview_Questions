package CodingChallenge;

public class FindMaxMin {
    public static void main(String[] args){
        int[] arr = {2,5,8,3,1};
        int[] arr1 = {1};
        maxAndMin(arr1);
    }

    private static void maxAndMin(int[] arr) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i : arr){
            if(max < i)
                max = i;
            else if (min > i) {
                min = i;
            }
        }
        System.out.println("Max : "+max+" Min : "+min);
    }
}
