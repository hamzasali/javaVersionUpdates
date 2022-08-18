package com.cydeo;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class CarTest {
    public static void main(String[] args) {

        //Zero Arg constructor
        Supplier<Car> c1 = () -> new Car();
        System.out.println(c1.get().getModel());

        Supplier<Car> c2 = Car::new;
        System.out.println(c2.get().getModel());

        //one arg constructor
        Function<Integer, Car> f1 = model -> new Car(model);
        Function<Integer, Car> f2 = Car::new;
        System.out.println(f2.apply(2016).getModel());

        //Two args constructor
        BiFunction<String, Integer, Car> b1 = (make, model) -> new Car(make, model);
        BiFunction<String, Integer, Car> b2 = Car::new;
        Car dodge = b2.apply("Dodge", 2016);
        System.out.println(dodge.getModel() + " " + dodge.getMake());
    }
}
