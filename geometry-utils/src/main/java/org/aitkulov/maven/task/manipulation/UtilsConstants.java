package org.aitkulov.maven.task.manipulation;

public enum UtilsConstants {

    COMPARE_RESULT_TEMPLATE_NOT_EQUAL("The %s of:\n%s is bigger than the %s of:\n%s"),
    COMPARE_RESULT_TEMPLATE_EQUAL("The %s of:\n%s is equal to the %s of:\n%s");

    private final String value;

    UtilsConstants(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }


}
