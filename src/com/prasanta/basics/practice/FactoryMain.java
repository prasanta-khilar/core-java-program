package com.prasanta.basics.practice;

public class FactoryMain {
    public static void main(String[] args) {
        DesignPatternFactoy designPatternFactoy = new DesignPatternFactoy();
        OS obj = designPatternFactoy.getInstance("hbb");
        obj.spec();
    }
}
