package org.aitkulov.maven.task.shape;

public class Triangle implements Shape {
    private final double side1;
    private final double side2;
    private final double side3;

    public Triangle(double side1, double side2, double side3) {
        validateSides(side1, side2, side3);

        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    private static void validateSides(double side1, double side2, double side3) {
        if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
            throw new IllegalArgumentException("Sides must be positive");
        }
        if (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1) {
            throw new IllegalArgumentException("Sides do not form a triangle");
        }
    }

    @Override
    public double calculateArea() {
        double semiP = (side1 + side2 + side3) / 2;
        return Math.sqrt(semiP * (semiP - side1) * (semiP - side2) * (semiP - side3));
    }

    @Override
    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }
}
