package Task1;

public class Main {
    public static void main(String[] args) {
        double perimeter = 0;

        Square square1 = new Square(5, 4);
        Triangle triangle1 = new Triangle(2, 4, 6, 2);
        Circle circle1 = new Circle(5);
        Triangle triangle2 = new Triangle(8, 6, 10, 4);
        Square square2 = new Square(10,12);

        Figure[] figure = new Figure[]{triangle1, square1, triangle2, square2, circle1};

        for (Figure figures : figure) {
            System.out.println(figures);
            perimeter += figures.getPerimeter();
        }

        System.out.println("all perimeters = " + perimeter);
    }

}
