package Codility;

public class BinaryGap {
    public static void main(String[] args){
        int number = 1041;
        int number1 = 9881;
        int number2 = 32;
        binaryGap(number);
    }

    private static void binaryGap(int number) {
        String binary = Integer.toBinaryString(number);
        int maxGap = 0;
        int currentGap = 0;
        boolean counting = false;

        for (char c : binary.toCharArray()) {
            if (c == '1') {
                if (counting) {
                    maxGap = Math.max(maxGap, currentGap);
                }
                // Start counting again after first 1
                counting = true;
                currentGap = 0;
            } else if (counting) {
                // Only count zeros if we’ve seen a 1 before
                currentGap++;
            }
        }

       System.out.println(maxGap);
    }
}