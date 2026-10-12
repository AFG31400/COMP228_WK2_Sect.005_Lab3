package com.va.week5.lab3;

public class Nurse extends Person {
    String department;
    String shift;

    public Nurse(int personId, String name, int age, String department, String shift) {
        super(personId, name, age);
        this.department = department;
        this.shift = shift;
    }
    public void assistPatient() {
        System.out.println("Nurse is assisting the patient.");
    }
    @Override
    public void performDuties() {
        System.out.println("Nurse is working the " + shift + " shift.");
    }
}