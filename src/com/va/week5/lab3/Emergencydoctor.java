package com.va.week5.lab3;

public class Emergencydoctor extends Doctor implements Medicalprofessional, Billable {

    public Emergencydoctor(int personId, String name, int age, String specialization, Double consultationFee) {
        super(personId, name, age, specialization, consultationFee);
    }
    public void handleEmergency() {
        System.out.println("Emergency doctor handling an emergency case");
    }
    @Override
    public void prescribeMedication() {
        System.out.println("Prescribing emergency meds.");
    }
    @Override
    public void generateBill() {
        System.out.println("Generating ER bill.");
    }
    @Override
    public void performDuties() {
        System.out.println("Emergency doctor working in the ER.");
    }
}