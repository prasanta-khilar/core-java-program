package com.prasanta.basics.program;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;

public class StringToMapKeyValue {
    public static void main(String[] args) {



        String utilMapString = "key1:value1;key2:value2";
        String[] part = utilMapString.split(";");
        System.out.println("String splits: "+part);

        Map<String, String> attributes = new HashMap<>();
        attributes.put("a", "1");
        attributes.put("b", "2");
        attributes.put("c", "3");
        String s = attributes.entrySet()
                .stream()
                .map(e -> e.getKey()+"="+e.getValue())
                .collect(joining("&"));

        System.out.println("attributes : "+s);
        String key1 = Stream.of(utilMapString.split("[;:]")).collect(joining(",key1="));
//                map(el -> el.split(":")).
//                collect(toMap(arr -> arr[0], arr -> arr[1], (oldValue, newValue) -> oldValue));
        System.out.println(key1);
    }

}
