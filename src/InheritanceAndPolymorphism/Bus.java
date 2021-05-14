package InheritanceAndPolymorphism;

public class Bus extends Vehicle {
    private boolean headlightsOn;

    public Bus(int maxSpeed) {
        super(maxSpeed);
        this.headlightsOn = false;
    }

    public void start() {
        System.out.println("...cranking bus engine");
    }

    public void honkHorn() {
        System.out.println("Honk honk!!!!!");
    }

    public boolean isHeadlightsOn() {
        return headlightsOn;
    }

    public void setHeadlightsOn(boolean headlightsOn) {
        this.headlightsOn = headlightsOn;
    }
}