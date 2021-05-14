package InheritanceAndPolymorphism;

public class Vehicle {
    private int numberOfOccupants;

    private int maxSpeed;

    public Vehicle() {
        this.maxSpeed = 0;
    }

    public Vehicle(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void start() {
        System.out.println("Starting ...");
    }

    public int getNumberOfOccupants() {
        return this.numberOfOccupants;
    }

    public void setNumberOfOccupants(int numberOfOccupants) {
        this.numberOfOccupants = numberOfOccupants;
    }

    public int getMaxSpeed() {
        return this.maxSpeed;
    }}