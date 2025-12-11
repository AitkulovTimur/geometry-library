package org.aitkulov.maven.task.shape.rectangular;

import org.aitkulov.maven.task.shape.ThreeDShape;

/**
 * RectangularPrism shape implementation.
 */
public class RectangularPrism implements ThreeDShape {
    private final double width;
    private final double height;
    private final double depth;

    public RectangularPrism(double width, double height, double depth) {
        validateSides(width, height, depth);

        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    private static void validateSides(double width, double height, double depth) {
        if (width <= 0 || height <= 0 || depth <= 0) {
            throw new IllegalArgumentException("All dimensions must be positive");
        }
    }

    @Override
    public double calculateVolume() {
        return width * height * depth;
    }

    @Override
    public double calculateSurfaceArea() {
        return 2 * (width * height + width * depth + height * depth);
    }

    @Override
    public String toString() {
        return "RectangularPrism{" +
                "width=" + width +
                ", height=" + height +
                ", depth=" + depth +
                '}';
    }
}
