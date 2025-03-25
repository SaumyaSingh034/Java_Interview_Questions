package Static;

import java.util.Arrays;

public class Test1 {
    static final int x;
    static final int[] arr = {1,2,3};


    static {
        x = 100;
    }
    public static void main(String[] args){
        arr[0] = 100;
        System.out.println(x);
        System.out.println(Parent.x);
        System.out.println(Child.x);
        System.out.println(Arrays.toString(arr));
    }
}
