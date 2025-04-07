package April;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class KRotateArraySuperSimple {
    public static void main(String[] args) {
        Integer[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        List<Integer> list = Arrays.asList(nums);
        Collections.rotate(list, k);

        System.out.println("Rotated Array: " + list);
    }
}
