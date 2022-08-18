package com.cydeo;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        Calculate calc = (x, y) -> System.out.println(x + y);
        Calculate calc1 = (x, y) -> Calculator.findSum(x, y);

        //Reference to static method
        Calculate calc2 = Calculator::findSum;
        calc2.calculate(10, 20);

        //Reference to instance method
        Calculator obj = new Calculator();
        Calculate calc3 = obj::findMultiply;

        Calculate calc4 = new Calculator()::findMultiply;
        calc3.calculate(4, 6);

        BiFunction<String, Integer, String> func1 = (str, i) -> str.substring(i);

        BiFunction<String, Integer, String> func2 = String::substring;

        Function<Integer, Double> b = new MyClass()::method;
        BiFunction<MyClass, Integer, Double> b1 = MyClass::method;


    }
}
