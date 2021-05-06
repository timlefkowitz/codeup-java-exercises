package shapes;

public class ShapesTest {
    public static void main(String[] args){


        Rectangle rectanglebox = new Rectangle(5,4);

        System.out.println("rectanglebox.getPerimeter() = " + rectanglebox.getPerimeter());
        System.out.println("rectanglebox.getPerimeter() = " + rectanglebox.getArea());

        //Square

        Square squareBox = new Square(5);
        System.out.println("SquareBox.getPerimeter() = " + squareBox.getPerimeter());
    }
}
