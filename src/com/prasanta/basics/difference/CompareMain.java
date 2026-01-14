package com.prasanta.basics.difference;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompareMain {
    public static void main(String[] args) {
        Student student1 = new Student(101,"prasanta");
        Student student2 = new Student(106,"hrishika");
        Student student3 = new Student(109,"aditi");
        Student student4 = new Student(102,"rubina");
        Student student5 = new Student(107,"maman");
        Student student6 = new Student(103,"kitu");
        List<Student> list = new ArrayList<>();
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        list.add(student5);
        list.add(student6);
        Collections.sort(list,new NameComparator());
        System.out.println(list);
    }
}
