package com.prasanta.basics.designpattern.singletonpattern;

public class SingletonBreakUsingClone extends SingletonClone{
     private static SingletonBreakUsingClone instance;
    private SingletonBreakUsingClone(){
    }
//protected Singleton
    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Can't be created same object");
    }

    public static synchronized SingletonBreakUsingClone getInstance(){
        if(instance==null){
            return instance = new SingletonBreakUsingClone();
        }else {
            return instance;
        }
    }
}
