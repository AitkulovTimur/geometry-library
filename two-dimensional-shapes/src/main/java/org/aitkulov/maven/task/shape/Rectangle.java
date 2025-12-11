package org.aitkulov.maven.task.shape;

/**
 * Rectangle shape implementation.
 */
public class Rectangle implements TwoDShape {
    private final double width;
    private final double height;

    public Rectangle(double width, double height) {
        validateSides(width, height);

        this.width = width;
        this.height = height;
    }

    private static void validateSides(double width, double height) {
        if (width <= 0 || height <= 0) {
            throw new IllegalArgumentException("Sides of rectangle must be positive");
        }
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (width + height);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
