package com.bridgelabz.quantitymeasurement.service;

public enum QuantityConversion {
    FEET_TO_INCH(12, 0),FEET_TO_FEET(1,1),
    INCH_TO_FEET(0,12),INCH_TO_INCH(1,1),
    FEET_TO_YARD(0,3),INCH_TO_YARD(0,36),
    YARD_TO_INCH(36,0),YARD_TO_FEET(3,0);

    Double firstMetric;
    Double secondMetric;

    QuantityConversion(double firstMetric, double secondMetric) {
        this.firstMetric = firstMetric;
        this.secondMetric = secondMetric;
    }
}
