package com.prasanta.basics.program;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MaleFemaleCount {

    public static void main(String[] args) {

        List<Person> personList = new ArrayList<>();
        personList.add(new Person(1, "prasanta", Gender.MALE, 26));
        personList.add(new Person(2, "prasanta2", Gender.MALE, 26));
        personList.add(new Person(3, "prasanta3", Gender.FEMALE, 26));
        personList.add(new Person(4, "prasanta4", Gender.MALE, 26));
        personList.add(new Person(5, "prasanta5", Gender.FEMALE, 26));
        personList.add(new Person(6, "prasanta6", Gender.MALE, 26));
        personList.add(new Person(7, "prasanta7", Gender.FEMALE, 26));
        personList.add(new Person(8, "prasanta8", Gender.MALE, 26));
        personList.add(new Person(9, "prasanta9", Gender.FEMALE, 26));
        personList.add(new Person(10, "prasanta10", Gender.MALE, 26));
        personList.add(new Person(11, "prasanta11", Gender.MALE, 26));
        personList.add(new Person(12, "prasanta12", Gender.FEMALE, 26));
        personList.add(new Person(13, "prasanta13", Gender.MALE, 26));
        personList.add(new Person(14, "prasanta14", Gender.FEMALE, 26));
        personList.add(new Person(15, "prasanta15", Gender.FEMALE, 26));
        personList.add(new Person(16, "prasanta16", Gender.FEMALE, 26));
        personList.add(new Person(17, "prasanta27", Gender.FEMALE, 26));
        personList.add(new Person(18, "prasanta33", Gender.MALE, 26));
        personList.add(new Person(19, "prasanta44", Gender.FEMALE, 26));
        personList.add(new Person(20, "prasanta443", Gender.FEMALE, 26));
        personList.add(new Person(21, "prasanta211", Gender.MALE, 26));
        personList.add(new Person(22, "prasanta322", Gender.FEMALE, 26));
        personList.add(new Person(23, "prasanta212", Gender.MALE, 26));
        personList.add(new Person(24, "prasanta65", Gender.FEMALE, 26));

        List<Person> collectFemale = personList.stream().filter(p -> p.getGender().equals(Gender.FEMALE)).collect(Collectors.toList());
        System.out.println("Collect Female EMployee count: "+collectFemale.size());
        List<Person> collectMale = personList.stream().filter(e -> e.getGender().equals(Gender.MALE)).collect(Collectors.toList());
        System.out.println("Collect Male Employee count: "+collectMale.size());
    }
}
