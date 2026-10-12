package com.va.week5.lab3;

public class Person {
    int personId;
    String name;
    int age;
    public Person(int personId, String name, int age) {
        this.personId = personId;
        this.name = name;
        this.age = age;
    }
    public void performDuties() {
        System.out.println("Person is performing hospital duties.");
    }
}