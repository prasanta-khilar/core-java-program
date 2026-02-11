package com.prasanta.basics.demo.multiThread;

import java.util.concurrent.*;

class MyCallable implements Callable<String>{

    @Override
    public String call() throws Exception {
        return "executed Callable ";
    }
}
//DQDPK7077M
public class FutureImplementation {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService ex = Executors.newSingleThreadExecutor();
        Future<String> submit = ex.submit(new MyCallable());
        System.out.println(submit.get());

    }
}
