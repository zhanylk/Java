package Tasks.Shape;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    } // new commant

    @Override
    public double calculateArea() {
        return 3.14* radius * radius;
    }

}
