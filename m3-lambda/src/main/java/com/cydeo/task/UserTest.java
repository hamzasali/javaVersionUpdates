package com.cydeo.task;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class UserTest {
    public static void main(String[] args) {

        List<User> users = new ArrayList<>();
        users.add(new User("Mike", "Smith", 35));
        users.add(new User("Tom", "Evan", 25));
        users.add(new User("Emma", "Pollard", 55));

        //print all the element in the list

        printName(users, user -> true);

        // print all people that last name starts with E
        printName(users, p -> p.getLastName().startsWith("E"));


    }

    // write method
    private static void printName(List<User> userList, Predicate<User> predicate) {
        for (User user : userList) {
            if (predicate.test(user)) {
                System.out.println(user.toString());
            }
        }
    }
}
