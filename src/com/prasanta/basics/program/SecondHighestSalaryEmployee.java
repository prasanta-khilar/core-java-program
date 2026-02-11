package com.prasanta.basics.program;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SecondHighestSalaryEmployee {


    public static void main(String[] args) {

        List<Employee> employeeStringList = new ArrayList<>();
        employeeStringList.add(new Employee(1,"prasanta",450000));
        employeeStringList.add(new Employee(2,"rakesh",785522));
        employeeStringList.add(new Employee(3,"ramesh",120000));
        employeeStringList.add(new Employee(4,"Swadesh",840000));
        employeeStringList.add(new Employee(5,"Oliva",480000));
        employeeStringList.add(new Employee(6,"john",980000));
        employeeStringList.add(new Employee(7,"willson",1230000));
//
        Optional<Employee> secHighSal = employeeStringList.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).skip(1).findFirst();

        System.out.println("Second highest Salary: "+ secHighSal.get().getSalary());

        
    }
}
