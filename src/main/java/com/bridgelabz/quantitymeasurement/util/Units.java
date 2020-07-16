package com.bridgelabz.quantitymeasurement.util;

public enum Units {

    FEET(100), INCH(8.33), YARD(300), CM(3.28),
    KG(1000), GRAM(1), TONNE(1000000),
    LITRE(1000), GALLON(3784.58), ML(1);


    double value;

    Units(double value) {
        this.value = value;
    }

    public double getValue() {
        return this.value;
    }
}
