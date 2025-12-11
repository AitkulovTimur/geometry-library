package org.aitkulov.maven.task.shape;

/**
 * TriangularPrism shape implementation.
 */
public class TriangularPrism implements ThreeDShape {
    private final Triangle base;
    private final double height;

    public TriangularPrism(Triangle base, double height) {
        validateTrianglePrism(base, height);

        this.base = base;
        this.height = height;
    }

    private static void validateTrianglePrism(Triangle base, double height) {
        if (base == null) throw new IllegalArgumentException("Base cannot be null");

        if (height <= 0) throw new IllegalArgumentException("Height must be positive");
    }

    @Override
    public double calculateVolume() {
        return base.calculateArea() * height;
    }

    @Override
    public double calculateSurfaceArea() {
        double baseArea = base.calculateArea();
        double perimeter = base.calculatePerimeter();
        return 2 * baseArea + perimeter * height;
    }

    @Override
    public String toString() {
        return "TriangularPrism{" +
                "base=" + base +
                ", height=" + height +
                '}';
    }
}
