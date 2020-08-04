package com.inteview.question.java.interview.immutable;

public final class Immutable {

    private final String property1;
    private final String property2;

    public Immutable(String property1, String property2) {
        this.property1 = property1;
        this.property2 = property2;
    }

    public String getProperty2() {
        return property2;
    }

    public String getProperty1() {
        return property1;
    }
}



