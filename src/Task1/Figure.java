package Task1;

public abstract class Figure {
    private double square;
    private double perimeter;

    public Figure() {

    }

    public void setSquare(double square) {
        this.square = square;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public double getSquare() {
        return square;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public abstract double countSquare();

    public abstract double countPerimeter();

    @Override
    public String toString() {
        return "\nFigure -> " +
                "square = "+ square +
                ", perimeter = " + perimeter + "\n";
    }
}
