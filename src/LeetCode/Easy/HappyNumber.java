package LeetCode.Easy;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    public static void main(String[] args){
        int n = 19;
        isHappyNumber(n);
    }

    private static boolean isHappyNumber(int n) {
        Set<Integer> data = new HashSet<>();
        while(n!=1 && !data.contains(n)){
            data.add(n);
            n = getNext(n);
        }
        return n==1;

    }

    private static int getNext(int n) {
        int totalSum = 0;
        while(n>0){
            int digit = n%10;
            totalSum +=digit*digit;
            n/=10;
        }
        return totalSum;
    }
}
