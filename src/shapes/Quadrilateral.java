package shapes;

public abstract class Quadrilateral extends shape implements Measurable {
    protected int length;
    protected int width;

    public Quadrilateral(int length, int width) {
        this.length = length;
        this.width = width;
    }

    int area = length * width;

    abstract class boxarea{
        int area = length * width;
    }


}
