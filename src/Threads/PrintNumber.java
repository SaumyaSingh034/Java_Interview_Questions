package Threads;

public class PrintNumber {
    private int number = 1;
    private final int MAX = 100;

    public synchronized void printOdd() throws InterruptedException {
        while(number < MAX){
            while( number % 2 == 0) wait();
            System.out.println(Thread.currentThread().getName());
            notify();
        }
    }

    public synchronized void printEven() throws InterruptedException {
        while(number < MAX){
            while( number % 2 != 0) wait();
            System.out.println(Thread.currentThread().getName());
            notify();
        }
    }
}
