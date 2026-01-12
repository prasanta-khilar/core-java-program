package com.prasanta.basics.java8datetime;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class AgeCalculator {
    public static void main(String[] args) {
       LocalDate dob = LocalDate.of(1988,Month.AUGUST,17);
       LocalDate today = LocalDate.now();
       Period period = Period.between(dob,today);
        System.out.println("Age is :"+period.getYears()+" Years " +period.getMonths()+" Months "+ period.getDays()+" Days");
    }
}
