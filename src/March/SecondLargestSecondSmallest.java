package March;

public class SecondLargestSecondSmallest {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int[] arr1 = {1,1,1,2,2,2};
        System.out.println(printSecondLargest(arr1));
        System.out.println(printSecondSmallest(arr1));
    }

    private static int printSecondSmallest(int[] arr) {
        int min = Integer.MAX_VALUE;
        int sMin = Integer.MAX_VALUE;
        for(int i=0;i< arr.length;i++){
            if(min>arr[i]){
                sMin = min;
                min = arr[i];
            } else if (sMin > arr[i] && sMin != min) {
                sMin = arr[i];

            }else {
                //System.out.println("No Max Value");
            }
        }
        return  sMin;
    }

    private static int printSecondLargest(int[] arr) {
        int max = Integer.MIN_VALUE;
        int sMax = Integer.MIN_VALUE;
        for(int i=0;i< arr.length;i++){
            if(max<arr[i]){
                sMax = max;
                max = arr[i];
            } else if (sMax<arr[i] && sMax < max) {
                sMax = arr[i];

            }
        }
        return sMax;
    }
}
