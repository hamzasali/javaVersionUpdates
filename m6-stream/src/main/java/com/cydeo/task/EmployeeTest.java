package com.cydeo.task;

import java.util.List;

public class EmployeeTest {
    public static void main(String[] args) {

        //Print all emails
        EmployeeData.readAll()
                .map(Employee::getEmpEmail)
                .forEach(System.out::println);

        System.out.println("-------------------------------");
        //Print all phone numbers
        EmployeeData.readAll()
                .flatMap(n -> n.getEmpPhoneNumbers().stream())
                .forEach(System.out::println);

        System.out.println("-------------------------------");
        //Print all phone numbers
        EmployeeData.readAll()
                .map(Employee::getEmpPhoneNumbers)
                .flatMap(List::stream)
                .forEach(System.out::println);


    }
}
