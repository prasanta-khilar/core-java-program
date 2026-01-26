package com.prasanta.basics.practice;

public class DesignPatternBuilder {

    private String os;
    private String processor;
    private double screeSize;
    private int battery;
    private int camera;

    public DesignPatternBuilder setOs(String os) {
        this.os = os;
        return this;
    }

    public DesignPatternBuilder setProcessor(String processor) {
        this.processor = processor;
        return this;
    }

    public DesignPatternBuilder setScreeSize(double screeSize) {
        this.screeSize = screeSize;
        return this;
    }

    public DesignPatternBuilder setBattery(int battery) {
        this.battery = battery;
        return this;
    }

    public DesignPatternBuilder setCamera(int camera) {
        this.camera = camera;
        return this;
    }
    public Phone getPhone(){
        return new Phone(os,processor,screeSize,battery,camera);
    }
}
