package com.va.week5.lab3;

public class Surgeon extends Doctor {
    String surgeryType;
    String operatingRoom;

    public Surgeon(int personId, String name, int age, String specialization, Double consultationFee, String surgeryType, String operatingRoom) {
        super(personId, name, age, specialization, consultationFee);
        this.surgeryType = surgeryType;
        this.operatingRoom = operatingRoom;
    }
    public void performSurgery() {
        System.out.println("Surgeon is doing " + surgeryType);
    }
    @Override
    public void performDuties() {
        System.out.println("Surgeon is scrubbing in for surgery.");
    }
}