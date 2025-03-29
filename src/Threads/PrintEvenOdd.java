package Threads;

public class PrintEvenOdd {

    public static void main(String[] args){
        PrintNumber number = new PrintNumber();
         new Thread(() -> {
             try {number.printOdd();} catch (InterruptedException e) {throw new RuntimeException(e);}
         }, "Odd Thread").start();

         new Thread(() -> {
             try {number.printEven();} catch (InterruptedException e) {throw new RuntimeException(e);}
         }, "Even Thread").start();
    }
}
