package shapes;
import java.util.Scanner;

public class Circle {

    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public double setRadius(double userRadius){
        return radius = userRadius;
    }

    public double getArea(){
        return Math.PI * (radius * radius);
    }

    public double getCircumference(){
        return 2 * Math.PI * radius;
    }

    public static void CircleApplication(){
        double input;
        Scanner sc = new Scanner(System.in);
        boolean looper = true;
        while(looper) {
            System.out.println("Please input a number so we can use that as a radius for a cicle!");
            boolean looper2 = true;
            while (looper2) {
                sc.hasNextDouble();
                if (sc.hasNextDouble()) {
                    input = sc.nextDouble();
                    Circle newCircle = new Circle(input);
                    looper2 = false;
                    System.out.printf("This is your circle's circumference: %.2f\n", newCircle.getCircumference());
                    System.out.printf("This is your circle's area: %.2f\n", newCircle.getArea());
                    System.out.println("Would you like to input another number so we can make another circle? Please answer with just yes or no.");

                    boolean looper3 = true;
                    while (looper3) {
                        String yesOrNo = sc.next();
                        if (yesOrNo.equalsIgnoreCase("yes")) {
                            System.out.println("Here we go again!");
                            looper3 = false;
                        } else if (yesOrNo.equalsIgnoreCase("no")) {
                            System.out.println("Ok no more circles!");
                            looper3 = false;
                            looper2 = false;
                            looper = false;
                        } else {
                            System.out.println("Try again.");
                            looper3 = true;
                        }
                    }
                    } else{
                        System.out.println("Try Again.");
                        CircleApplication();
                    }
                }
            }
        }
        public static void main(String[] args){
            CircleApplication();

    }
}
