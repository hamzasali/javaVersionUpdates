package com.cydeo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamOperation {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 1, 3, 3, 2, 4);
//        list.forEach(System.out::println);

        //FILTER
        System.out.println("->->->->->-> Filter <-<-<-<-<-<-");
        list.stream()
                .filter(i -> i % 2 == 0)
                .forEach(System.out::println);

        //Distinct
        System.out.println("->->->->->-> Distinct <-<-<-<-<-<-");
        Stream<Integer> str = list.stream()
                .filter(i -> i % 2 == 0)
                .distinct();
        str.forEach(System.out::println); // stream closed

        //Limit
        System.out.println("->->->->->-> Limit <-<-<-<-<-<-");

        list.stream()
                .filter(i -> i % 2 == 0)
                .limit(1)
                .forEach(System.out::println);

        //Skip
        System.out.println("->->->->->-> Skip <-<-<-<-<-<-");
        list.stream()
                .filter(i -> i % 2 == 0)
                .skip(1)
                .forEach(System.out::println);
    }
}
