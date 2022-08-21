package com.cydeo;

import com.cydeo.task.Dish;
import com.cydeo.task.DishData;

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


    }
}
