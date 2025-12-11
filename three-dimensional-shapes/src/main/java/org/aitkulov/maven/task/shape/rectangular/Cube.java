package org.aitkulov.maven.task.shape.rectangular;

import org.aitkulov.maven.task.shape.ThreeDShape;

/**
 * Cube shape implementation.
 */
public class Cube implements ThreeDShape {
    private final double side;

    public Cube(double side) {
        validateSide(side);

        this.side = side;
    }

    private static void validateSide(double side) {
        if (side <= 0) throw new IllegalArgumentException("Side must be positive");
    }

    @Override
    public double calculateVolume() {
        return Math.pow(side, 3);
    }

    @Override
    public double calculateSurfaceArea() {
        return 6 * side * side;
    }

    @Override
    public String toString() {
        return "Cube{" +
                "side=" + side +
                '}';
    }
}
