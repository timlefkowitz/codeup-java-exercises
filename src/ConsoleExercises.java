import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double pi = 3.14159;
        System.out.println("The value of pi is approximately "+ pi);

        System.out.println("Enter a integer");
        String intnumber = sc.next();
        System.out.printf("Your number is, %s\n", intnumber);



    }
}
