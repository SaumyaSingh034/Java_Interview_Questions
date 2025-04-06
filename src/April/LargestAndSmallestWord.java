package April;

public class LargestAndSmallestWord {
    public static void main(String[] args){
        String input = "This is an example sentence";
        findLargestAndSmallest(input);
    }

    private static void findLargestAndSmallest(String input) {
        String[] arr = input.split("\\s");
        String largest = arr[0];
        String smallest = arr[0];

        for(String s : arr){
            if(s.length()>largest.length()){
                largest = s;
            } else if (s.length()<smallest.length()) {
                smallest = s;

            }
        }
        System.out.println("Largest : "+largest+" Smallest : "+smallest);
    }
}
