package com.prasanta.basics.demo.multiThread;

import java.util.concurrent.*;

class MyCallableTask implements Callable<String>{

    @Override
    public String call() throws Exception {
        return "Task executed in Callable ";
    }
}
//DQDPK7077M
public class FutureTaskImplementation {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService ex = Executors.newSingleThreadExecutor();
        FutureTask<String> ft = new FutureTask<>(new MyCallableTask());
         ex.submit(ft);
        System.out.println(ft.isDone()+" "+ ft.get());

    }
}
