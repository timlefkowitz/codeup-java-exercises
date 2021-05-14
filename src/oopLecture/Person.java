package oopLecture;

public class Person {
    public String firstName;
    public String lastName;

    public Person(String firstName, String lastName) {

    }


    public String sayHello(){
        return "Hello, "+ this.firstName + " " + this.lastName + " .";
    }

    public String joinsChat(){
        return lastName + ", " + firstName + " has joined the chat!";
    }

    public static long worldPop = 7_850_000_000L;

    public static void main(String[] args){

    }
}
