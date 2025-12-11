package org.aitkulov.maven.task.manipulation;

public enum GeometricQuantities {

    AREA("area"),
    PERIMETER("perimeter");

    private final String value;

    GeometricQuantities(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }


}
