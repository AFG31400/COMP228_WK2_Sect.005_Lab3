package com.va.week5.lab3;

public class Doctor extends Person {
    String specialization;
    Double consultationFee;

    public Doctor(int personId, String name, int age, String specialization, Double consultationFee) {
        super(personId, name, age);
        this.specialization = specialization;
        this.consultationFee = consultationFee;
    }
    public void diagnosePatient() {
        System.out.println("Doctor is diagnosing a patient.");
    }
    @Override
    public void performDuties() {
        System.out.println("Doctor is examining charts and patients.");
    }
}