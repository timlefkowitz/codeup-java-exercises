import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double pi = 3.14159;
        System.out.println("The value of pi is approximately "+ pi);

        // Enter a number

        System.out.println("Enter a integer");
        String intnumber = sc.next();
        System.out.printf("Your number is, %s\n", intnumber);

        // 3 words

        Scanner firstword = new Scanner(System.in);
        System.out.println("Enter 3 words, Your first word is?");
        String first = firstword.nextLine();

        Scanner secondword = new Scanner(System.in);
        System.out.println("Your 2nd word is? ");
        String second = secondword.nextLine();

        Scanner thirdword = new Scanner(System.in);
        System.out.println("Your 3rd word is? ");
        String third = thirdword.nextLine();

        System.out.printf(first, second, third);

        //




    }
}
