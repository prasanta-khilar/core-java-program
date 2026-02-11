package com.prasanta.basics.program;

@FunctionalInterface
interface StaticReference{

    int execute();
    static int operation(int x){
        System.out.println("I am static and not be overridden");
        return x;
    }
}
public class Java8StaticMethodInterface {

    public static void main(String[] args) {

        int operation = StaticReference.operation(5);
        System.out.println(operation);

    }

}
