package com.prasanta.basics.program;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

class PersonC {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

public class FunctionalInterfaceMethod {

    public static void main(String[] args) {

        //predicate --boolean results
        Predicate<String> predicate = str -> str.length() > 5;
        System.out.println(predicate.test("pras"));
        PersonC personC = new PersonC();


        //Consumer->only input and no output, In input only modify the data
        Consumer<PersonC> personCConsumer = t -> t.setName("prasanta");
        personCConsumer.accept(personC);
        System.out.println(personC.getName());


        //3.FUnctiion-> both input and output
        Function<Integer, String> function = t -> t * 20 + " :  is multiply by 20";
        System.out.println(function.apply(2));


        //Supplier ->only output and no input
        Supplier<Double> supplier = () -> Math.random();
        System.out.println(supplier.get());
    }
}
