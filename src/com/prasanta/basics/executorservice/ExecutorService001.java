package com.prasanta.basics.executorservice;

import java.util.Date;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Service implements Runnable{
int i ;
public Service(int i){
    this.i = i;
}
    @Override
    public void run() {
        try {
            System.out.println(i + " ");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
public class ExecutorService001 {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService es = Executors.newFixedThreadPool(5);
        System.out.println("Start Execution of Threadpool : "+new Date());
        for(int i = 0;i<25;i++){
            es.execute(new Service(i));
        }
        es.awaitTermination(10, TimeUnit.SECONDS);
        System.out.println("End Execution of Threadpool : "+new Date());
    }
}
