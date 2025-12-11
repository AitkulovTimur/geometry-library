package org.aitkulov.maven.task.shape;

/**
 * Sphere shape implementation.
 */
public class Sphere implements ThreeDShape {
    private final double radius;

    public Sphere(double radius) {
        validateRadius(radius);

        this.radius = radius;
    }

    private static void validateRadius(double radius) {
        if (radius <= 0) throw new IllegalArgumentException("Radius must be positive");
    }

    @Override
    public double calculateVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    @Override
    public double calculateSurfaceArea() {
        return 4 * Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Sphere{" +
                "radius=" + radius +
                '}';
    }
}
