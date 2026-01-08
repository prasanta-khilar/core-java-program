package com.prasanta.basics.factorypattern;

public class FactoryPatternMain {
    public static void main(String[] args) {
//        OS operationSystem = new Windows();
//        operationSystem.spec();
        FactoryPattern operationSystemFactory = new FactoryPattern();
        OS os = operationSystemFactory.getInstance("ddd");
        os.spec();
    }
}
