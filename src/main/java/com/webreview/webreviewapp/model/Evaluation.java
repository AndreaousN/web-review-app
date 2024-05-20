package com.webreview.webreviewapp.model;

public enum Evaluation {
    ONE(1.0),
    TWO(2.0),
    THREE(3.0),
    FOUR(4.0),
    FIVE(5.0);

    private final double value;

    Evaluation(double value) {
        this.value = value;
    }
    public double getValue() {
        return value;
    }
}
