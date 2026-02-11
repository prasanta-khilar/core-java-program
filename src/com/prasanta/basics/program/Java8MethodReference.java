package com.prasanta.basics.program;


@FunctionalInterface
interface AbcInterface{
public int operation(int x);
}
public class Java8MethodReference {

    public static void main(String[] args) {
        //Normal lamda function
        AbcInterface ref = (x) -> (x*x);
        System.out.println(ref.operation(5));

        //using static method  reference
        AbcInterface ref1 = Java8MethodReference::multiPleData;
        System.out.println(ref1.operation(5));

        //using instance method reference
        Java8MethodReference myOwnReference = new Java8MethodReference();
        AbcInterface ref2 = myOwnReference::cubeit;
        System.out.println(ref2.operation(5));
    }
public int cubeit(int n){
        return n*n*n;
}
    public static int multiPleData(int n){

        return n*n;
    }
}
