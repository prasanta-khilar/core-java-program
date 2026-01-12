package com.prasanta.basics.java8;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

@FunctionalInterface
interface  UPIPayment{
    String doPayment(String source,String dest);
    default double getScratchCard(){
        return new Random().nextDouble();
    }
    static String datePattern(String patterns){
        SimpleDateFormat dateFormat = new SimpleDateFormat(patterns);
        return dateFormat.format(new Date());
    }

}
