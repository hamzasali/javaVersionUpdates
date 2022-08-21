package com.cydeo;

import com.cydeo.task.Dish;
import com.cydeo.task.DishData;
import com.cydeo.task.Type;

import java.util.*;
import java.util.stream.Collectors;

public class CollectorsDemo {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(3, 4, 5, 6, 6, 7, 8, 9);

        // toCollection(Supplier) : is used to create a collection using Collector
        List<Integer> numberList = numbers.stream()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toCollection(ArrayList::new));

        System.out.println(numberList);

        Set<Integer> numberSet = numbers.stream()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toCollection(HashSet::new));

        System.out.println(numberSet);

        //toList() : returns a Collector interface that gather the input data into a new list

        List<Integer> numberList2 = numbers.stream()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(numberList2);

        //toSet : returns a Collector interface that gather the input data into a new set

        Set<Integer> numberSet2 = numbers.stream()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toSet());

        System.out.println(numberSet2);

        //toMap(Function, Function) : returns a Collector interface that gathers the input data into a new map

        Map<String, Integer> dishMap = DishData.getAll().stream()
                .collect(Collectors.toMap(Dish::getName, Dish::getCalories));

        System.out.println(dishMap);

        //summingInt(ToIntFunction) : returns a collector that produces the sum of a Integer-valued func
        Integer sum = DishData.getAll().stream()
                .collect(Collectors.summingInt(Dish::getCalories));

        System.out.println(sum);

        //counting() : returns a Collector that counts the number of the elements
        Long evenCount = numbers.stream()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.counting());

        System.out.println(evenCount);

        // averagingInt(toIntFunction) : return the average of the integers passed values
        Double calorieAverage = DishData.getAll().stream()
                .collect(Collectors.averagingInt(Dish::getCalories));

        System.out.println(calorieAverage);

        //joining() : is used to join various elements of a character or string array into a single obj
        List<String> courses = Arrays.asList("Java", "JS", "TS");
        String str = courses.stream()
                .collect(Collectors.joining(","));

        System.out.println(str);

        //partitionBy() : is used to partition a stream of obj (or a set of elements) based on a given predicate
        Map<Boolean, List<Dish>> veggieDish = DishData.getAll().stream()
                .collect(Collectors.partitioningBy(Dish::isVegetarian));

        System.out.println(veggieDish);

        //groupingBy() : is used for grouping objs by some properties and storing results in a map instance
        Map<Type, List<Dish>> dishType = DishData.getAll().stream()
                .collect(Collectors.groupingBy(Dish::getType));

        System.out.println(dishType);



    }
}