package March;

import java.util.ArrayList;

public class ListManipulation {
    public static void main(String[] args){
        int[] arr = {1,4,3,6,8};
        manipulationOfList(arr);

    }

    private static void manipulationOfList(int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();
        for(int i : arr){
            if(i%2==0){
                int product = i * i;
                result.add(product);
            }
            else {
                result.add(i);
            }
        }
        System.out.println(result);
    }
}
