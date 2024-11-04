package Tasks.Shape;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapes = List.of(
                new Circle(5.0),
                new Rectangle(4.0, 6.0),
                new Triangle(3.0, 4.0)
        );

        ShapeCalculator calculator = new ShapeCalculator();
        calculator.printAreas(shapes);
    }
}
