package Tasks.Shape;

import java.util.List;

public class ShapeCalculator {
    public void printAreas(List<Shape> shapes) {
        for (Shape shape : shapes) {
            System.out.println("Площадь " + shape.calculateArea());
        }
    }
}
