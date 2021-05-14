package InheritanceAndPolymorphism;

public class Jet extends Vehicle {
    private int altitude;

    public Jet(int maxSpeed) {
        super(maxSpeed);
        this.altitude = 0;
    }

    public void start() {
        System.out.println("...igniting jets");
    }
}