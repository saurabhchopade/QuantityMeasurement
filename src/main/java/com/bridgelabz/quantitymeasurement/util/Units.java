package com.bridgelabz.quantitymeasurement.util;

public enum  Units {
    FEET(1),INCH(0.0833),YARD(3);
    double value;

    Units(double value) {
        this.value = value;
    }
    public double getValue()
    {
        return this.value;
    }
}
