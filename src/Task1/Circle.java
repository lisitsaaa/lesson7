package Task1;

public class Circle extends Figure {
    private int r;

    public Circle(int r) {
        this.r = r;
        countSquare();
        countPerimeter();
    }

    @Override
    public double countSquare() {
        double square = Math.PI * r * r;
        setSquare(square);
        return square;
    }

    @Override
    public double countPerimeter() {
        double perimeter = 2 * Math.PI * r;
        setPerimeter(perimeter);
        return perimeter;
    }

    @Override
    public String toString() {
        return "Circle -> " +
                "r = " + r + super.toString();
    }
}
