package InterviewQuestions;

import java.util.ArrayList;
import java.util.List;

public class OSTTRA_IntersectionArrayList {
    public static void main(String[] args){
        List<Integer> arr1 = new ArrayList<>();
        List<Integer> arr2 = new ArrayList<>();
        arr1.add(2);
        arr1.add(1);
        arr1.add(5);
        arr1.add(6);
        arr1.add(7);

        arr2.add(12);
        arr2.add(5);
        arr2.add(6);
        arr2.add(17);
        arr2.add(4);
        arr2.add(7);
        arr2.add(4);
        arr2.add(1);

        List<Integer> result = new ArrayList<>();
        for(int i : arr1){
            if(arr1.contains(i) && arr2.contains(i)){
                result.add(i);
            }
        }
        System.out.println(result);
    }
}
