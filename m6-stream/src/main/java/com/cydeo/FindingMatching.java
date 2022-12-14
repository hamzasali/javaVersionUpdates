package com.cydeo;

import com.cydeo.task.Dish;
import com.cydeo.task.DishData;

import java.util.*;
import java.util.Optional;
import java.util.stream.IntStream;

public class FindingMatching {

    public static void main(String[] args) {

        // ALL MATCH
        System.out.println("->->->->->-> ALL MATCH <-<-<-<-<-<-");
        boolean isHealthy = DishData.getAll().stream().allMatch(dish -> dish.getCalories() < 1000);
        System.out.println(isHealthy);

        //ANY MATCH
        System.out.println("->->->->->-> ANY MATCH <-<-<-<-<-<-");
        if (DishData.getAll().stream().anyMatch(Dish::isVegetarian)) {
            System.out.println("The menu is vegetarian friendly");
        }

        //NONE MATCH
        System.out.println("->->->->->-> NONE MATCH <-<-<-<-<-<-");
        Boolean isHealthy2 = DishData.getAll().stream().noneMatch(dish -> dish.getCalories() >= 1000);
        System.out.println(isHealthy2);

        //FIND ANY
        System.out.println("->->->->->-> FIND ANY <-<-<-<-<-<-");
        Optional<Dish> dish = DishData.getAll().stream().filter(Dish::isVegetarian).findAny();
        System.out.println(dish.get());

        //FIND ANY
        System.out.println("->->->->->-> FIND ANY <-<-<-<-<-<-");
        Optional<Dish> dish2 = DishData.getAll().stream().filter(Dish::isVegetarian).findFirst();
        System.out.println(dish2.get());

        //PARALLEL STREAM(Async)
        System.out.println("->->->->->-> PARALLEL STREAM(Async) <-<-<-<-<-<-");
        System.out.println(IntStream.range(0, 100).parallel().findAny());
        System.out.println(IntStream.range(0, 100).parallel().findFirst());

        List<String> list1 = Arrays.asList("Jhonny", "David", "Jack", "Duke", "Jill", "Dany", "Julia", "Jenish", "Divya");
        List<String> list2 = Arrays.asList("Jhonny", "David", "Jack", "Duke", "Jill", "Dany", "Julia", "Jenish", "Divya");

//        Optional<String> findFirst = list1.parallelStream().filter(s -> s.startsWith("D")).findFirst();
//        Optional<String> findAny = list2.parallelStream().filter(s -> s.startsWith("J")).findAny();

        Optional<String> findFirst = list1.stream().filter(s -> s.startsWith("D")).findFirst();
        Optional<String> findAny = list2.stream().filter(s -> s.startsWith("J")).findAny();

        System.out.println(findFirst.get());
        System.out.println(findAny.get());

        //MIN
        System.out.println("->->->->->-> MIN <-<-<-<-<-<-");
        Optional<Dish> min = DishData.getAll().stream().min(Comparator.comparing(Dish::getCalories));
        System.out.println(min.get());

        //MAX
        System.out.println("->->->->->-> MAX <-<-<-<-<-<-");
        Optional<Dish> max = DishData.getAll().stream().max(Comparator.comparing(Dish::getCalories));
        System.out.println(max.get());

    }
}
