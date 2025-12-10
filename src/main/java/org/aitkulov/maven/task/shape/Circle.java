package org.aitkulov.maven.task.shape;

public class Circle implements Shape {
    private final double radius;

    public Circle(double radius) {
        validateRadius(radius);

        this.radius = radius;
    }

    private static void validateRadius(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Radius must be positive");
        }
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return Math.PI * radius * 2;
    }

}
