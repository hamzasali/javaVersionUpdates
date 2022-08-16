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

        AppleHeavyPredicate abc = new AppleHeavyPredicate();
        List<Apple> heavyApple = filterApples(applesList, abc);
        System.out.println("heavyApple = " + heavyApple);

        List<Apple> greenApple = filterApples(applesList, new AppleGreenColorPredicate());
        System.out.println("greenApple = " + greenApple);

        ApplePredicate weight = apple -> apple.getAppleWeight() > 200;

        filterApples(applesList, weight);
    }

    private static List<Apple> filterApples(List<Apple> inventory, ApplePredicate applePredicate) {
        List<Apple> result = new ArrayList<>();

        for (Apple apple : inventory) {
            if (applePredicate.test(apple)) {
                result.add(apple);
            }
        }
        return result;
    }

}
