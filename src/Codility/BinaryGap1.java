package Codility;

public class BinaryGap1 {
    public static void main(String[] args){
      int number = 1041;
      getTheBinaryGap(number);
    }

    private static void getTheBinaryGap(int number) {
        String binary = Integer.toBinaryString(number);
        int maxGap = 0;
        int currentGap = 0;
        boolean counting = false;

        for(char c : binary.toCharArray()){
            if(c == '1'){
               if(counting){
                   maxGap = Math.max(maxGap, currentGap);
               }
               counting = true;
               currentGap = 0;
            } else if (counting) {
                currentGap++;
            }
        }
        System.out.println(maxGap);
    }
}
