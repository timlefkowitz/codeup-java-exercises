package InheritanceAndPolymorphism;

import oopLecture.Person;

public class Employee extends Person {
    private double salary;

    public Employee(String firstName, String lastName) {
        super(firstName, lastName);
        this.firstName = "Emp " + firstName;
    }

    public String joinsChat() {
        return this.firstName + " joining the company chat server.";
    }

    public void doWork() {
        System.out.println("Work, work...");
    }
}