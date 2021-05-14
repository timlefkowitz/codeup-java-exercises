package App;

public class App {
    public static void main(String[] args){

        Animal [] animals = {
                new Cow(),
                new Dog(),
                new bird()
        };

        for(int i =0; i < animals.length; i++){
            animals[i].speak();
        }

        Animal myCow = new Cow();
        myCow.eat();

        Animal myDog = new Dog();
        myDog.eat();


    }
}
