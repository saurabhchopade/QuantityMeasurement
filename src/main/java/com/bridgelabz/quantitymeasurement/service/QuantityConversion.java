package com.bridgelabz.quantitymeasurement.service;

public enum QuantityConversion {
    FEET_TO_INCH(12, 0),FEET_TO_FEET(1,1);

    Double firstMetric;
    Double secondMetric;

    QuantityConversion(double firstMetric, double secondMetric) {
        this.firstMetric = firstMetric;
        this.secondMetric = secondMetric;
    }
}
