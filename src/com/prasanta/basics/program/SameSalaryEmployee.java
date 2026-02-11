package com.prasanta.basics.program;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.counting;

public class SameSalaryEmployee {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(1, "John", 1000));
        employees.add(new Employee(1, "Peter", 2000));
        employees.add(new Employee(1, "John", 3000));
        employees.add(new Employee(1, "Steve", 2000));
        employees.add(new Employee(1, "Steve", 1000));

        // display all Employees
//        System.out.println("Complete Employee list:");
//        employees.stream().forEach(System.out::println);

// calculate sum of Employee salaries with Stream reduce method
//        System.out.printf(
//                "Sum of Employees' salaries (via reduce method): %.2f%n",
//                employees.stream()
//                        .mapToDouble(Employee::getSalary)
//                        .reduce(0, (value1, value2) -> value1 + value2));

//        int total = employees.stream()
//                .collect(Collectors.summingInt(Employee::getId));

//                .filter(company -> Collections.frequency(companies, company) > 1)
        double sum = employees.stream().
                filter(Employee -> Collections.frequency(employees,Employee)>1).mapToDouble(Employee::getSalary).sum();

        Map<Employee, Long> collect = employees.stream()
                .collect(Collectors.groupingBy(Function.identity(), counting()));
//                .entrySet()
//                .stream()
//                .filter(e -> e.getValue() > 1)
//                .map(Map.Entry::getKey)
//                .collect(toList());
        System.out.println(collect);
        HashSet<Object> seen = new HashSet<>();
//        employee.removeIf(e -> !seen.add(e.getID()));
//        double sum1 = employees.stream().
//                filter(e -> e.getEmpName()).mapToDouble(Employee::getSalary).sum();
////        System.out.println("Total Employees Salary : " + total);
//        System.out.println("Total Employees Salary of 1000 Dept : " + sum1);

    }
}
