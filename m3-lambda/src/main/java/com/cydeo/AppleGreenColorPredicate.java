package com.cydeo;

public class AppleGreenColorPredicate implements ApplePredicate{
    @Override
    public boolean test(Apple apple) {
        return apple.getAppleColor().equals(Color.GREEN);
    }
}
