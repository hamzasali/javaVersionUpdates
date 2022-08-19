package com.cydeo.task;

import java.util.Comparator;

public class DishTask {
    public static void main(String[] args) {

        //Print all dish name that has less than 400 calories

        DishData.getAll().stream()
                .filter(d -> d.getCalories() < 400)
                .map(Dish::getName)
                .forEach(System.out::println);

        System.out.println("-----------------------------");
        //Print the length of the name of each dish

        DishData.getAll().stream()
                .map(Dish::getName)
                .map(d -> d.length())
                .forEach(System.out::println);

        System.out.println("-------------------------------");

        // Print three high caloric dish name (>300)

        DishData.getAll().stream()
                .filter(f -> f.getCalories() > 300)
                .limit(3)
                .map(Dish::getName)
                .forEach(System.out::println);

        System.out.println("-------------------------------");

        // Print all dish name that are below 400 calories in sorted
        DishData.getAll().stream()
                .sorted(Comparator.comparing(Dish::getCalories))
                .filter(d -> d.getCalories() < 400)
                .map(Dish::getName)
                .forEach(System.out::println);

    }
}
