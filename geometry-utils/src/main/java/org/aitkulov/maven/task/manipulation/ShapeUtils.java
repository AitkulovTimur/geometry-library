package org.aitkulov.maven.task.manipulation;

import org.aitkulov.maven.task.shape.Shape;


public class ShapeUtils {
    public static String compareByAndGetInfo(Shape shapeToCompare1, Shape shapeToCompare2,
                                             GeometricQuantities compareByParameter) {
        double shapeToCompare1Value = compareByParameter == GeometricQuantities.AREA ?
                shapeToCompare1.calculateArea() :
                shapeToCompare1.calculatePerimeter();
        double shapeToCompare2Value = compareByParameter == GeometricQuantities.AREA ?
                shapeToCompare2.calculateArea() :
                shapeToCompare2.calculatePerimeter();

        if (shapeToCompare1Value > shapeToCompare2Value) {
            return returnComparisonResultInfoIfNotEqual(shapeToCompare1, shapeToCompare2, compareByParameter);
        } else if (shapeToCompare1Value < shapeToCompare2Value) {
            return returnComparisonResultInfoIfNotEqual(shapeToCompare2, shapeToCompare1, compareByParameter);
        } else {
            return returnComparisonResultInfoIfEqual(shapeToCompare1, shapeToCompare2, compareByParameter);
        }


    }

    private static String returnComparisonResultInfoIfNotEqual(Shape biggerShape, Shape smallestShape,
                                                               GeometricQuantities compareByParameter) {
        return String.format(UtilsConstants.COMPARE_RESULT_TEMPLATE_NOT_EQUAL.getValue(), compareByParameter.getValue(),
                biggerShape, compareByParameter.getValue(), smallestShape);
    }

    private static String returnComparisonResultInfoIfEqual(Shape shapeToCompare1, Shape shapeToCompare2,
                                                            GeometricQuantities compareByParameter) {
        return String.format(UtilsConstants.COMPARE_RESULT_TEMPLATE_EQUAL.getValue(), compareByParameter.getValue(),
                shapeToCompare1, compareByParameter.getValue(), shapeToCompare2);
    }
}
