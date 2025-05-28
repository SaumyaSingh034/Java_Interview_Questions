package Codility;

public class FrogJump {
    public static void main(String[] args){
        int x = 10;
        int y = 85;
        int d = 30;
        int x1 = 3;
        int y2 = 999111321;
        int d3 = 7;
        calculateFrogJump(x1,y2,d3);
        System.out.println(calculateFrogJump1(x,y,d));
    }

    public static int calculateFrogJump1(int x, int y, int d) {
        return (int) Math.ceil((double)(y - x) / d);
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
