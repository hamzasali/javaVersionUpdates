package com.cydeo;

import java.util.ArrayList;
import java.util.List;

public class AppleTest {

    public static void main(String[] args) {

        List<Apple> applesList = new ArrayList<>();

        applesList.add(new Apple(Color.GREEN, 201));
        applesList.add(new Apple(Color.RED, 303));
        applesList.add(new Apple(Color.RED, 101));
        applesList.add(new Apple(Color.GREEN, 89));

        List<Apple> heavyApple = filterApple(applesList, new AppleHeavyPredicate());
        System.out.println("heavyApple = " + heavyApple);
        List<Apple> greenApple = filterApple(applesList, new AppleGreenColorPredicate());
        System.out.println("greenApple = " + greenApple);

        ApplePredicate weight = apple -> apple.getAppleWeight() > 200;

        filterApple(applesList, weight);
    }

    private static List<Apple> filterApple(List<Apple> inventory, ApplePredicate applePredicate) {
        List<Apple> result = new ArrayList<>();

        for (Apple apple : inventory) {
            if (applePredicate.test(apple)) {
                result.add(apple);
            }
        }
        return result;
    }


}
