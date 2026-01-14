package com.prasanta.basics.singletonpattern;

public class SingletonPattern {
     private static   SingletonPattern instance;
    private SingletonPattern(){
    }
    public static   synchronized SingletonPattern getInstance(){
        if(instance==null){
            return instance = new SingletonPattern();
        }else {
            return instance;
        }
    }
}
