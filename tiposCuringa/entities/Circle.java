package tiposCuringa.entities;

public class Circle implements Shape {
    private double Radius;

    public Circle(double radius) {
        Radius = radius;
    }

    public double getRadius() {
        return Radius;
    }

    public void setRadius(double radius) {
        Radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * Radius * Radius;
    }
}
