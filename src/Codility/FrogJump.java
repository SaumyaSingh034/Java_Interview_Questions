package Codility;

public class FrogJump {
    public static void main(String[] args){
        int x = 10;
        int y = 85;
        int d = 30;
        calculateFrogJump(x,y,d);
    }

    private static void calculateFrogJump(int x, int y, int d) {
        int distanceCovered = x;
        int frogJump = 0;
        while(distanceCovered < y){
            distanceCovered = distanceCovered + d;
            frogJump++;
        }
        System.out.println(frogJump);
    }
}
