import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {

        System.out.println(addition(4, 8));
        System.out.println(subtraction(4, 8));
        System.out.println(multiplication(4, 8));
        System.out.println(division(4, 8));
    }


    // basic Arithmetic

    public static double addition(double num1, double num2) {
        double result = num1 + num2;
        return result;
    }

    public static double subtraction(double num1, double num2) {
        double result = num1 - num2;
        return result;
    }

    public static double multiplication(double num1, double num2) {
        double result = num1 * num2;
        return result;
    }

    public static double division(double num1, double num2) {
        double result = num1 / num2;
        return result;
    }

//    public static int getUsernum(int usernum){
//        System.out.println("Guess a number from 1 to 100 ");
////        Scanner usernum = new Scanner(System.in);
//    }

//    public static int getInteger(int min, int max) {
//        Scanner integerscan = new Scanner(System.in);
//
//        int userMin = 1;
//        int userMax = 10;
//
//        System.out.println("Enter a number 1-10");
//        int userInput = integerscan.nextInt();
//
//    }

//        if (userMin < 1 | userMax > 10 ){
//            System.out.print("Congrats, your input of %d was within our Min and Max!", userInput);
//        } else {
//
//        }

//        System.out.println("Please enter a Max number 1-10");
//        int Maxnumber = integerscan.nextInt();
//
//        System.out.println("Please enter")


//        System.out.println("please enter a number through " + minnumber + " to " + Maxnumber);

//        System.out.println("Enter a number 1-10");
//        int number = sc.nextInt();
//
//        do {
//            if(number <= 5){
//                System.out.println("What a weak mind");
//            } else if(number >= 6){
//                System.out.println("Big burrito mind");
//            }
//        } while (number);


//        System.out.print("Enter a number between 1 and 10: ");
//        int userInput = getInteger(1,10);
//    }

//    public static void countToLoop(int num){
//        for (int i = 0; i <= num; getInteger()++){
//            System.out.println(i);
//        }
//    }


//
//}

}
