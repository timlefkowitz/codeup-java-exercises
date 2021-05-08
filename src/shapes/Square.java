package shapes;

import java.util.Scanner;

public class Square extends Quadrilateral {

    public Square(int side){
        super(side, side);
    }

    @Override
    public double getArea(){
        return Math.pow(this.length, 2);
    }
    @Override
    public double getPerimeter(){
        return this.length * 4;
    }
    @Override
    public void setLength(double i){
        this.length = i;
        this.width = i;
    }
    @Override
    public void setWidth(double i){
        this.length = i;
        this.width = i;
    }
//




}

//
//    private int length;
//    protected int side = length;
//
//    public Square(int side) {
//        super(side, side);
//        this.side = side;
//    }
//
//    public int getArea() {
//        return side * side;
//    }
//
//    public int getPerimeter() {
//        return 4 * side;
//    }


//    int side = length;

//    public int getArea(){
//        return side * side;
//        }


