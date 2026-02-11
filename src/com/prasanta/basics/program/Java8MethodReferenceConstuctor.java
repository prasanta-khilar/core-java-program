package com.prasanta.basics.program;



interface AbcInterfaceConst{
    Java8MethodReferenceConstuctor createMsg(String s);
}
public class Java8MethodReferenceConstuctor {

    public Java8MethodReferenceConstuctor(String str){
        System.out.println("Message: "+ str);
    }
    public static void main(String[] args) {
        AbcInterfaceConst abc = x-> new Java8MethodReferenceConstuctor(x);
        abc.createMsg("Hello Constructor");

        AbcInterfaceConst abc1 = Java8MethodReferenceConstuctor::new;
        abc1.createMsg("Hello Constructor I am here");
    }
}
