import java.util.Arrays;
import java.util.Scanner;


public class ArraysExercises {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        //Create an array that holds 3 Person objects. Assign a new instance of the Person class to each element. Iterate through the array and print out the name of each person in the array.

        String[] persons = new String[5];

        person shermz = new person("Shermz","Synth");
        person kai = new person("kai", "Boom");
        person dani = new person("dani", "campbell");
        person kenneth = new person("kenneth", "howl");
        person paige = new person("paige", "lefkowitz");

//        persons[0] = shermz.firstName;
//        persons[1] = kai.firstName;
//        persons[2] = dani.firstName;
//        persons[3] = kenneth.firstName;
//        persons[4] = paige.firstName;

        System.out.print("Persons[0] = " + persons[0] + " Persons[1] = " + persons[1] + " Persons[2] = " + persons[2]  + " Persons[3] = " + persons[3]  + " Persons[4] = " + persons[4]);



        for (int i = 0; i < persons.length; i++) {
            System.out.println("Welcome to the geekdom " + persons[i]);
        }

//        addPerson(person, Person.name);

    }
    //Create a static method named addPerson. It should accept an array of Person objects, as well as a single person object to add to the passed array. It should return an array whose length is 1 greater than the passed array, with the passed person object at the end of the array.


    public static String[] addPerson(String[] array, String object){
        String[] copyarray = Arrays.copyOf(array, array.length + 1);
        copyarray[array.length] = object;
        return copyarray;
    }


}
