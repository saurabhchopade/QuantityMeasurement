package com.bridgelabz.quantitymeasurement.util;

public enum  Units {
    FEET(1),INCH(12),YARD(3);
    Double value;

    Units(double value) {
        this.value = value;
    }
    public double getValue()
    {
        return this.value;
    }
}
