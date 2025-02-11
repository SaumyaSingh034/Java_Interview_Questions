package February2025;

public class SumEqualsTarget {
    public static void main(String[] args){
        int[] arr = {6,8,11,6,7,18};
        int[] arr1 = {1,3,2,2,0,3,0,4};
        int target = 17;
        int target1 = 4;
        printTheIndexOfSum(arr1, target1);

    }

    private static void printTheIndexOfSum(int[] arr, int target) {
        for(int i=0;i<arr.length-1;i++){
           int sum = arr[i] + arr[i+1];
           if(sum == target){
               System.out.println("Indexs are : "+i+" and "+(i+1));
           }
        }
    }
}
