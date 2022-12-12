package Task1;

public class Triangle extends Figure {
    private int a;
    private int b;
    private int c;
    private int h;

    public Triangle(int a, int b, int c, int h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
        countSquare();
        countPerimeter();
    }

    @Override
    public double countSquare() {
        double square = (c * h) / 2.0;
        setSquare(square);
        return square;
    }

    @Override
    public double countPerimeter() {
        double perimeter = a + b + c;
        setPerimeter(perimeter);
        return perimeter;
    }

    @Override
    public String toString() {
        return "Triangle -> " +
                "a = " + a +
                ", b = " + b +
                ", c = " + c +
                ", h = " + h + super.toString();
    }
}
