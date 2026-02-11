package com.prasanta.basics.program;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;




public class UniqueProdNameUpperCase {

    public static void main(String[] args) {

        //to print unique productnames in Uppercase where the orders have
        // product value > 1000 and Location is "New Jersey" }
        ArrayList<Order> orders = new ArrayList<Order>();
        orders.add(new Order("prasanta", 1200, "New Jersey"));
        orders.add(new Order("khilar", 600, "Bangalore"));
        orders.add(new Order("prasanta", 1800, "New Jersey"));
        orders.add(new Order("pkk", 982, "hyd"));
        orders.add(new Order("khilarprasanta", 2200, "New Jersey"));
        orders.add(new Order("pK", 950, "pune"));

        List<Order> collect = orders.stream().filter(e->e.getProductname()== e.productName.toUpperCase())
                .filter(e -> e.getValue() > 1000).filter(e -> e.getLocation() == "New Jersey").collect(Collectors.toList());
        System.out.println("Check product name is Upper or not : "+collect);
        List<String> listProdUppername = orders.stream()
                .filter(e -> e.getValue() > 1000).filter(e -> e.getLocation() == "New Jersey")
                .map(Order::getProductname).map(String::toUpperCase).collect(Collectors.toList());
        System.out.println("list Product Name uppercase: "+listProdUppername);
        List<String> uniqueProdNameUppercase = orders.stream()
                .filter(e -> e.getValue() > 1000).filter(e -> e.getLocation() == "New Jersey")
                .map(Order::getProductname).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(e -> e.getValue() == 1).map(Map.Entry::getKey).map(String::toUpperCase).collect(Collectors.toList());
        System.out.println("Unique Product Name Uppercase: "+uniqueProdNameUppercase);

    }

}
