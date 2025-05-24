package test;

import java.util.Arrays;

public class Test4 {
    public static void main(String[] args){
        String str = "0000012350609";
        String str1 = "010100010110110";
       // removeZeros(str);
        moveAllZeroToFront(str1);
    }

    private static void moveAllZeroToFront(String str1) {
        char[] ch = str1.toCharArray();
        char[] result = new char[ch.length];
        int left = 0;
        int right = ch.length-1;
        for(int i=0;i< ch.length;i++){
            if(ch[i] == '0'){
                result[left++] = ch[i];
            }else
                result[right--] = ch[i];
        }


        System.out.println(Arrays.toString(result));
    }

    private static void removeZeros(String str) {
        int nonZero = 0;
        char[] ch = str.toCharArray();
        for(int i=0; i<ch.length;i++){
            if(ch[i] != '0' ){
                nonZero = i;
                break;
            }
           
        }
        System.out.println(str.substring(nonZero));
    }
}
