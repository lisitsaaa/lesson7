package Task1;

public class Square extends Figure {
    private int a;
    private int b;

    public Square(int a, int b) {
        this.a = a;
        this.b = b;
        countSquare();
        countPerimeter();
    }

    @Override
    public double countSquare() {
        double square = a * b;
        setSquare(square);
        return square;
    }

    @Override
    public double countPerimeter() {
        double perimeter = 2 * a + 2 * b;
        setPerimeter(perimeter);
        return perimeter;
    }

    @Override
    public String toString() {
        return "Square -> " +
                "a = " + a +
                ", b = " + b + super.toString();
    }
}
