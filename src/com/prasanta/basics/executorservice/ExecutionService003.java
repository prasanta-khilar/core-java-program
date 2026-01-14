package com.prasanta.basics.executorservice;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.*;

class Service2 implements Callable<String>{
int i ;
public Service2(int i){
    this.i=i;
}


    @Override
    public String call() throws Exception {
    Thread.sleep(1000);
        System.out.println("In Thread :"+i);
        return "from Thread :"+i;
    }
}
public class ExecutionService003 {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService es = Executors.newFixedThreadPool(2);
        System.out.println( new Date());
        List<Future<String>> futureList = new ArrayList<>();
        for(int i=0;i<10;i++){
            futureList.add(es.submit(new Service2(i)));
        }
        es.shutdown();
        es.awaitTermination(10, TimeUnit.SECONDS);//wait till here
        System.out.println("===================================");
        for(Future<String> fut :futureList) {
            System.out.println(fut.get());
        }
            System.out.println(new Date());

        }
    }

