package com.cydeo.task;

import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class Person {
    private String name;
    private int age;
    private Gender gender;

}
