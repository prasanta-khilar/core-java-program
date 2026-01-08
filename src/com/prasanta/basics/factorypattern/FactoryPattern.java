package com.prasanta.basics.factorypattern;

public class FactoryPattern {
    public OS getInstance(String typeOs){
        if(typeOs.equals("Open")){
            return new Android();
        } else if (typeOs.equals("Closed")) {
            return new IOS();
        }else {
            return new Windows();
        }

    }
}
