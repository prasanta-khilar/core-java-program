package com.prasanta.basics.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SecondHighestSalaryEmployee {

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(101, "Amit", 50000),
                new Employee(102, "Rohit", 60000),
                new Employee(103, "Sneha", 75000),
                new Employee(104, "Pooja", 60000),   // duplicate salary
                new Employee(105, "Rahul", 90000),
                new Employee(106, "Anita", 75000)    // duplicate salary
        );
        Optional<Employee> sorted = employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(1).findFirst();
        Double secUsingMap = employees.stream().map(Employee::getSalary).distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println(sorted);
        System.out.println(secUsingMap);
    }
}
