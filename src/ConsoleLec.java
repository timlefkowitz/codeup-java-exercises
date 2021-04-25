import java.util.Scanner;

public class ConsoleLec {
    public static void main(String[] args) {
        System.out.println("Console IO Lecture");





        String firstName = "Douglas";
        String lastName = "Hirsh";



        //Multiple variables

        System.out.printf("Hello, %s!\n", firstName);

        int numberOfPets = 3;
        String typeOfPets = "cats";
        System.out.printf("I have %d %s. \n", numberOfPets, typeOfPets);

        //currency:
        int currencyPennies = 1000;
        System.out.printf("My iPhone cost %d\n", currencyPennies);


        // ======== USER INPUT
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your first name");
        String userFirstName = sc.next();

        System.out.printf("Nice to meet you, %s\n", userFirstName);

        System.out.println("How old are you?");
        int age = sc.nextInt();

        System.out.printf("Good to hear you are %d years old.\n", age);

        sc.nextLine();
        System.out.println("What is your favorite Quote:");

        String favoriteQuote = sc.nextLine();
        System.out.printf("Funny, \"%s\" is my favorite quote too.", favoriteQuote);


    }
}