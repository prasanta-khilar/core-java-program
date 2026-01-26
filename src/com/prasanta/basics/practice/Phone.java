package com.prasanta.basics.practice;

public class Phone {
    private String os;
    private String processor;
    private double screeSize;
    private int battery;
    private int camera;

    public Phone(String os, String processor, double screeSize, int battery, int camera) {
        this.os = os;
        this.processor = processor;
        this.screeSize = screeSize;
        this.battery = battery;
        this.camera = camera;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "os='" + os + '\'' +
                ", processor='" + processor + '\'' +
                ", screeSize=" + screeSize +
                ", battery=" + battery +
                ", camera=" + camera +
                '}';
    }
}
