package util;
import java.util.Scanner;


public class Input {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args){

    }

    public String getString(){

        System.out.println("Please input any random string please!");
        return sc.next();
    }

    public boolean yesOrNo(){
        System.out.println("Please input a variant of yes.");
        String userInput = sc.next();
        return userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes") || userInput.equalsIgnoreCase("yeah");
    }

    public int getInt(){
        int input;
        while (true){
            try{
                System.out.println("Enter an integer: ");
                input = Integer.valueOf(scanner.next());
                return input;
            }
            catch(Exception e){
                System.out.println("That's not an integer...");
            }
        }
    }
    public double getDouble(double min, double max){
        double input;
        while (true){
            System.out.printf("Enter a double between %.3f and %.3f: ", min, max );
            input = scanner.nextDouble();
            if (input >= min && input <= max){
                return input;
            }
        }
    }
    public double getDouble(){
        double input;
        while (true){
            try{
                System.out.println("Enter an integer: ");
                input = Double.valueOf(scanner.next());
                return input;
            }
            catch(Exception e){
                System.out.println("That's not an integer...");
            }
        }
    }
}