import java.util.Scanner;

public class ConsoleIOLecture {
    public static void main(String[] args) {
        System.out.println("Console IO Lecture");

        // ================================== print() and println()

        // this:
//        System.out.println("here");
//        System.out.println("there");

        // is equivalent to this:
//        System.out.print("here\n");
//        System.out.print("there\n");

        // without the newline characters, print outputs this:
//        System.out.print("here");
//        System.out.print("there");


        // to concatenate, just like JS:
        String firstName = "Douglas";
        String lastName = "Hirsh";
//        System.out.println(firstName + " " + lastName);

        // ================================== printf() / .format()

        // Print a formatted string using the following... printf(formatString, data)

        // same output as print():
//        System.out.printf("Hello");
//        System.out.printf("There");

        // multiple variables:
        System.out.printf("Hello, %s!\n", firstName);
        System.out.printf("Hello, %s %s!\n", firstName, lastName);

        // numbers
        int numberOfPets = 3;
        String typeOfPets = "cats";
        System.out.printf("I have %d %s.\n",numberOfPets, typeOfPets);

        // currency:
        float currencyPennies = 1000.001F;
        System.out.printf("My iPhone cost $%.2f\n", currencyPennies);

        // ================================== USER INPUT
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your first and last name?");
        String userFirstName = sc.next();
        String userLastName = sc.next();

        System.out.printf("Nice to meet you, %s %s\n", userFirstName, userLastName);

        System.out.println("How old are you?");

        int age = sc.nextInt();

        System.out.printf("Good to hear you are %d years old.\n", age);

        // Quirk of using next() then nextLine()...
        // https://stackoverflow.com/questions/13102045/scanner-is-skipping-nextline-after-using-next-or-nextfoo
        sc.nextLine();
        System.out.println("Favorite Quote:");

        String favoriteQuote = sc.nextLine();
        System.out.printf("Funny, \"%s\" is my favorite quote too.", favoriteQuote);


    }
}