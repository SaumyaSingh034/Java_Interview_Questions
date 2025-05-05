package May;

import java.util.Arrays;

public class CompareTwoArray {
    public static void main(String[] args){
        int[] data1 = {1,2,3,4};
        int[] data2 = {2,1,4,3};

        compareTwoArray(data1, data2);
    }

    private static boolean compareTwoArray(int[] data1, int[] data2) {
        if(data1.length!= data2.length)
            return false;
        else{
             Arrays.sort(data1);
            Arrays.sort(data2);
            for(int i=0;i<data1.length;i++){
                return data1[i] == data2[i];
            }
        }
        return false;
    }
}
