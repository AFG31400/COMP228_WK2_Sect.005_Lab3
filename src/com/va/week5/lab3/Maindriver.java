package com.va.week5.lab3;

public class Maindriver {
    public static void main(String[] args) {
        
        //objects created
        Doctor doc = new Doctor(1, "Paco", 21, "General", 100.0);
        Nurse nurse = new Nurse(2, "Eli", 25, "ICU", "Night");
        Surgeon surgeon = new Surgeon(3, "Dill", 61, "Heart", 400.0, "an operation", "0");
        Emergencydoctor erDoc = new Emergencydoctor(4, "Bill", 35, "Trauma", 200.0);

        //specialize methods
        doc.diagnosePatient();
        nurse.assistPatient();
        surgeon.performSurgery();
        erDoc.handleEmergency();

        System.out.println();
        
        //method overriding
        doc.performDuties();
        nurse.performDuties();
        surgeon.performDuties();
        erDoc.performDuties();

        System.out.println();

        //polymorphism
        Person person;

        person = doc;
        person.performDuties();

        person = nurse;
        person.performDuties();

        person = surgeon;
        person.performDuties();

        person = erDoc;
        person.performDuties();

        System.out.println();

        erDoc.prescribeMedication();
        erDoc.generateBill();
    }
}