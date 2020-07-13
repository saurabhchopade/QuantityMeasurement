package com.bridgelabz.quantitymeasurement.service;

public enum QuantityConversion {
    FEET_TO_INCH(12, 0);
    double firstMetric;
    double secondMetric;

    QuantityConversion(double firstMetric, double secondMetric) {
        this.firstMetric = firstMetric;
        this.secondMetric = secondMetric;
    }


}
