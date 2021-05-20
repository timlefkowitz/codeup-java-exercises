import java.util.Scanner;

public class Person {

//    private final String firstName;
//    private final String lastName;
    private String name;
        private int age;
        private int weight;
        private int salary;
        private String gadgets;
        String firstName;
        String lastName;


        public Person(String name, int age, int weight, int salary){
            this.name = name;
            this.age = age;
            this.weight =weight;
            this.salary = salary;
            this.gadgets = gadgets;
        }



    public Person() {

    }

    public Person(String name) {

            this.name = name;
    }

    public Person(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;

    }


    public String getName () {
                return this.name;
                //TODO: return the person's name
            }

            public void setName (String name){ //void = no return of a datatype expected
                //TODO: change the name property to the passed value
                this.name = name;

            }

            public int getAge(){
                return this.age;
            }

            public void setAge(int age){
                this.age = age;
            }

    public int getSalary() {
        return this.salary;
    }

    public int getWeight() {
        return this.weight;
    }

    public int getGadgets(){
            return this.getGadgets();
    }

    //            public void sayHello () {
//                //TODO: print a message to the console using the person's name
//                return String.format("Hello and welcome to CodeUp %s %s!", firstName, lastName);
//            }

    public static void main(String[] args) {
        // blueprint = class of person [come back later and make your classes uppercase!]
        Person tim = new Person();
        //The above could remind you of another thing we've done:
        //Scanner scannername = new Scanner [we've used the Scanner constructor before]

        System.out.println("tim.name = " + tim.getName()); //similar to what is tim.name?
        tim.setName("tim"); // set tim.name!
        System.out.println("tim.name = " + tim.getName()); //cool, now tim.name = "tim"
        System.out.println("tim.getAge() = " + tim.getAge());
        tim.setAge(32);
        System.out.println("tim.getAge() = " + tim.getAge());

        Person Timothy = new Person("Timothy", 21, 180, 300000);
        System.out.println("Timothy.getName() = " + Timothy.getName());
        System.out.println("Timothy.getAge() = " + Timothy.getAge());
        System.out.println("Timothy.getWeight() = " + Timothy.getWeight());
        System.out.println("Timothy.getSalary() = " + Timothy.getSalary());

        //visibility
        Person douglas = new Person();
        douglas.name = "douglas";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Tell me your name");
        String response = scanner.nextLine();


        Person user = new Person(response);

        System.out.println("user.getName() = " + user.getName());

    }

}
