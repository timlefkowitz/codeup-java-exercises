package shapes;

import java.util.Scanner;


public class Rectangle {
        protected int leng;
        protected int width;

        public Rectangle(int length, int width) {
            this.leng = length;
            this.width = width;
        }

        public int getArea(){
            return leng * width;
        }

        public int getPerimeter(){
            return 2 * leng + 2 * width;
        }

//        System.out.println("Enter the Length");
//        int Length = sc.nextInt();
//
//        System.out.println("Enter the Width");
//        int Width = sc.nextInt();
//
//        int getPerimeter = 2 * Length + 2 * Width;
//        int getArea = Length * Width;
//
//        System.out.println("Your perimeter is " + getPerimeter + " and your area is " + getArea);


}


