package com.prasanta.basics.program;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SortedMapValue {

    public static void main(String[] args) {

         Map<Integer,String> mapObject = new HashMap<>();
        mapObject.put(123,"Prasanta");
        mapObject.put(124,"Ajay");
        mapObject.put(126,"Bapi");
        mapObject.put(127,"Hrishika");
        mapObject.put(128,"Krisha");
        mapObject.put(129,"Aditi");
        mapObject.put(111,"Rubina");

        List<Map.Entry<Integer, String>> collectMap = mapObject.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.naturalOrder())).collect(Collectors.toList());
        System.out.println("Sort by Value: "+collectMap);
        List<Map.Entry<Integer, String>> collectMap11 = mapObject.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey(Comparator.naturalOrder())).collect(Collectors.toList());
        System.out.println("Sort by Key: "+collectMap11);

    }
}
