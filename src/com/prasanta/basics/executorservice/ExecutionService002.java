package com.prasanta.basics.executorservice;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.*;

class Service1 implements Runnable{
int i ;
public Service1(int i){
    this.i=i;
}
    @Override
    public void run()  {
        System.out.println("In Thread "+i);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
public class ExecutionService002 {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService es = Executors.newFixedThreadPool(2);
        System.out.println( new Date());
        List<Future<String>> futureList = new ArrayList<>();
        for(int i=0;i<10;i++){
            futureList.add((Future<String>) es.submit(new Service1(i)));
        }
        es.shutdown();
        es.awaitTermination(10, TimeUnit.SECONDS);//wait till here
        System.out.println("===================================");
        for(Future<String> fut :futureList) {
            System.out.println(fut.get());//null in case of runnable
        }
            System.out.println(new Date());

        }
    }

