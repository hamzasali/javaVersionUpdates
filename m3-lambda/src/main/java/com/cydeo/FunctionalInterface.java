package com.cydeo;

import java.util.function.*;

public interface FunctionalInterface {
    public static void main(String[] args) {


        ApplePredicate ap = new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return apple.getAppleWeight() > 200;
            }
        };

        //--------------- PREDICATE ---------------//
        System.out.println("--------------- PREDICATE ---------------");

        Predicate<Integer> lesserThan = i -> i < 18;
        System.out.println(lesserThan.test(20));


        //--------------- CONSUMER ---------------//
        System.out.println("--------------- CONSUMER ---------------");

        Consumer<Integer> display = i -> System.out.println(i);
        display.accept(10);


        //--------------- BI CONSUMER ---------------//
        System.out.println("--------------- BI CONSUMER ---------------");

        BiConsumer<Integer, Integer> addTwo = (x, y) -> System.out.println(x + y);
        addTwo.accept(1, 2);

        //--------------- FUNCTION ---------------//
        System.out.println("--------------- FUNCTION ---------------");

        Function<String, String> fun = s -> "Hello " + s;
        System.out.println(fun.apply("Cydeo"));

        //--------------- BI FUNCTION ---------------//
        System.out.println("--------------- BI FUNCTION ---------------");

        BiFunction<Integer, Integer, Integer> function = (x1, x2) -> x1 + x2;
        System.out.println(function.apply(2, 3));

        //--------------- SUPPLIER ---------------//
        System.out.println("--------------- SUPPLIER ---------------");

        Supplier<Double> randomValue = () -> Math.random();
        System.out.println(randomValue.get());

        Supplier<String> stringSupplier = () -> "Cydeo";
        System.out.println(stringSupplier.get());


    }
}
