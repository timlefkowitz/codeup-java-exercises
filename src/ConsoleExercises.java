import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        // Section 1


        double pi = 3.14159;
        System.out.format("The value of pi is approximately " + pi);
//        System.out.println("The value of pi is approximately "+ pi);


        // Section 2
        Scanner sc = new Scanner(System.in);
        //1
//        System.out.println("Enter Your integer.");
//        int number = sc.nextInt();
//        System.out.printf("Your number is, ", number);

        //2
//        System.out.println("Please enter 3 words.");
//        String word1 = sc.next();
//        String word2 = sc.next();
//        String word3 = sc.next();
//
//        System.out.printf("%s\n%s\n%s\n", word1, word2, word3);


        //3
//        System.out.println("Tell me something.");
//        String something = sc.nextLine();
//        System.out.println("You entered:");
//        System.out.println(something);



        //4
//        System.out.println("Tell me something.");
//        String something = sc.nextLine();
//        System.out.println("You entered:");
//        System.out.println(something);


//        //Section 3
//        System.out.println("Please enter the length of the classroom.");
//        int length = Integer.parseInt(sc.nextLine());
//
//        System.out.println("Please enter the width of the classroom.");
//        int width = Integer.parseInt(sc.nextLine());
//
//        int area = length * width;
//        int perimeter = (length * 2) + (width * 2);
//
//        System.out.printf("The area is: %d\n", area);
//        System.out.printf("The Perimeter is: %d\n", perimeter);


        //Bonus
        System.out.println("Please enter the length of the classroom.");
        double length = Double.parseDouble(sc.nextLine());

        System.out.println("Please enter the width of the classroom.");
        double width = Double.parseDouble(sc.nextLine());

        System.out.println("Please enter the height of the classroom.");
        double height = Double.parseDouble(sc.nextLine());

        System.out.printf("length = %f width = %f height = %f\n", length, width, height);

        double area = length * width;
        double perimeter = (length * 2) + (width * 2);
        double volume = area * height;

        System.out.printf("The area is: %d\n", area);
        System.out.printf("The Perimeter is: %d\n", perimeter);
        System.out.printf("The volume is: %d\n", volume);

    }
}
