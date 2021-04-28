public class SyntaxLecture {
    public static void main(String[] args) {
// ================== STATEMENTS

        // Statements may be...
        // Declarations
        int x;

        // Assignment expressions
        x = 3;

        // Any use of ++ or --
        x++;
        --x;

        // Method invocations
        Math.random();

        // Object creation expressions
        //SomeObject someObject = new SomeObject();

        // ================== COMMENTS
        // I'm a single line comment

        /*
        I'm
        A
        Multiline
        Comment
        Hello
         */

        // Multiline statement
        System
                .out
                .println("Multiline statement. Just have to end with a semicolon");


        // ================== DATA TYPES


        // use the smallest type needed for the job

        // primitive types...

//            byte age = -32;
//        System.out.println(age);
//            short minimumAnnualSalary = 15080;
//            int distanceToSaturn = 1200000000;
//            long numberOfHumanCells = 3000000000L; // L needed for compiler
//            //System.out.println(numberOfHumanCells);
//            float lengthOfBacteriaInInches = 0.00004F; // F needed for compiler
////            System.out.println(lengthOfBacteriaInInches);
//            double widthOfAtomInMeters = .00000000001;
//            char seatingSection = 'M'; // must wrap in single quotes
//            boolean everythingIsAwesome = false;

        // strings (not a primitive type)

        String thisIsAString = "Hello";
        //System.out.println(thisIsAString);

//              like in JS, strings must escape certain characters like quotes and use it to inject newline characters and other formatting
//        System.out.println("Hello\nWorld!");
//        System.out.println("Hello \\ World!");
//        System.out.println("Hello\tWorld!");
//        System.out.println("Hello \"World!\"");


        // ================== VARIABLES

        // declaration separate from initialization
//        int age;
//        age = 12;


        // declaration and initialization
        int age = 12;


        // ================== IDENTIFIERS AND KEYWORDS

        // see curriculum


        // ================== CONSTANTS

        // see curriculum
        final int SIDES_OF_A_DICE = 6;

        // ================== EXPRESSIONS

        // basically the same as JS
        int d20 = SIDES_OF_A_DICE + 14;


        // ================== OPERATORS

        // basically the same as JS


        // ================== ASSIGNMENT STATEMENTS

        // basically the same as JS


        // ================== CASTING

        // Link on casting... http://www.javainterviewpoint.com/type-casting-java-implicit-explicit-casting/


        // IMPLICIT
        short y = 5;


        // EXPLICIT

        // implicit casting - less to more precise (widening)

//                 float num1 = 2.22F;
//                 double num2 = num1;


        // explicit casting - more to less explicit casting (narrowing)

        double num3 = 3.1;
        float num4 = (float)num3;
//                 float num4 = (float) num3;
//
        System.out.println(num4);

    }
}