package shapes;

import java.util.Scanner;



public class Rectangle {
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Length");
        int Length = sc.nextInt();

        System.out.println("Enter the Width");
        int Width = sc.nextInt();

        int getPerimeter = 2 * Length + 2 * Width;
        int getArea = Length * Width;

        System.out.println("Your perimeter is " + getPerimeter + " and your area is " + getArea);

    }
}


