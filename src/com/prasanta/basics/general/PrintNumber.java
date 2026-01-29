package com.prasanta.basics.general;

public class PrintNumber {
    private int count=1;
    private final int MAX=20;
    public synchronized void print(){
        while (count<=MAX){
            System.out.println(Thread.currentThread().getName()+":"+count);
            count++;
            notifyAll();//wakeup other Thread;
            try {
                if (count <= MAX)
                    wait();  // current thread waits
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class ThreeThreadPrint{
    public static void main(String[] args) {
        PrintNumber number = new PrintNumber();
        Thread thread1 = new Thread(number::print,"Thread-1");
        Thread thread2 = new Thread(number::print,"Thread-2");
        Thread thread3 = new Thread(number::print,"Thread-3");
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
