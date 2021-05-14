package App;

public class Cow implements Animal {

    @Override
    public void speak() {
        System.out.println("Moo");
    }

    @Override
    public void eat() {
        System.out.println("Eatting Grass");
    }
}
