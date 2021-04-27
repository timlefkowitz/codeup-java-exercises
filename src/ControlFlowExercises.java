
import java.util.Scanner;
public class ControlFlowExercises {
    public static void main(String[] args) {

//    int i = 5;
//    while(i <= 15){
//        System.out.println("i is "+ i++);
//    }
//
//    // Do While
//    int t = 0;
//    do {
//        System.out.println(t);
//        i += 2;
//    }while(t <= 100);
//
//    //Counting down by 5's
//        int u = 100;
//        do {
//            System.out.println(u);
//            i-=5;
//        } while ( i >= -10);
//
//    // Starting from 2 and Square a number
//    double i = 2;
//    do {
//        System.out.println(i);
//        i *= i;
//    } while (i <= 1000000);
//
//    // for loops
//

//    // 1 to 15
//    for (int o = 0; o <= 15; o++){
//        System.out.println("o is: " + o);
//    }
//
//
//    // Increments by 2
//
//    for (int i = 0; i <=100; i +=2){
//        System.out.println("i is: "+ i);
//    }
//
//    // Counting down by 5's
//    for (int i = 100; i >=-10; i -= 5 ) {
//        System.out.println("i is: " + i);
//     }


        // SQUARING number
        for (double i = 2; i <= 1000000; i *= i) {
            System.out.println("i is: " + i);
        }

        // Fizz Buzz Question
        for (int i = 1; i <= 100; i++) {
            if (i % 15 == 0) {
                System.out.printf("FizzBuzz\t");
            } else if ((i % 3 == 0)) {
                System.out.printf("Fizz\t");
            } else if ((i % 5 == 0)) {
                System.out.printf("Buzz\t");
            } else {
                System.out.printf("%d\t", i);
            }
        }

        //  Powers Table

        // Wrote a for loop and just printed the questions before looping
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n How many numbers do you want to see? ");
        int userInt = scanner.nextInt();
        System.out.println("Number | Squared | Cubed");
        System.out.println("------ | ------- | -----");

        // Looping through numbers and squaring and cubing
        for (int i = 1; i <= userInt; i++){
            System.out.println(i + "      | " + (i * i) + "       | " + (i * i * i));

        }
//        Scanner scanner = new Scanner(System.in);
//        String userChoice = "yes";
//
//        do {
//            // Gets the input from the user
//            System.out.print("Enter an integer: ");
//            int integer = scanner.nextInt();
//
//            // Creates a header for Number, Square, Cubed
//            String header = "Number  " + "Squared " + "Cubed   " + "\n"
//                    + "======  " + "======= " + "=====   ";
//            System.out.println(header);
//
//            int square = 0;
//            int cube = 0;
//
//            String row = "";
//            for (int i = 1; i <= integer; i++) {
//
//                square = i * i;
//                cube = i * i * i;
//
//                row = i + "       " + square + "       " + cube;
//                System.out.println(row);
//            }
//
//            // Does user want to continue
//            System.out.print("Continue? (yes/no): ");
//            userChoice = scanner.next();
//            System.out.println();
//
//        }
//        while (!userChoice.equalsIgnoreCase("n"));

    }
}





//
//    for (long w = 100000000; w <= 100000000; w *= w){
//        System.out.println(w);
//    }


    // FIZZBUZZ
//        int n = 100;
        // loop for 100 times

//        for (int f = 1; f<=n; f++){
//
//        }

//    }
//}
