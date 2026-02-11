package com.prasanta.basics.demo.multiThread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ForkJoinPool;

public class CustomForkJoinPool {
    public static void main(String[] args) throws InterruptedException {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++)
            list.add(i);
        Long intitialTime = System.currentTimeMillis();
        ForkJoinPool fj = new ForkJoinPool(5);
        //more than 32767 is not create as forkjoinpool
        Thread t1 = new Thread(() -> fj.submit(() -> list.parallelStream().forEach(a -> {
            try {
                Thread.sleep(100);
                System.out.println(Thread.currentThread());
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        })).invoke());
        t1.start();
        t1.join();
        Long finalTime = System.currentTimeMillis();
        System.out.println("Time Taken :" + (finalTime - intitialTime));

    }
}
