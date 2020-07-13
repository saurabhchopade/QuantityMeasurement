package com.bridgelabz.quantitymeasurement.service;

public class QuantityMeasurement {
    public double result;

    /**
     * It will compare two quantity on the basis of quantity conversion
     *
     * @param firstDimensionValue
     * @param secondDimensionValue
     * @param quantityConversion
     * @return
     */
    public boolean quantityCompare(double firstDimensionValue, double secondDimensionValue, QuantityConversion quantityConversion) {
        if (quantityConversion.firstMetric == 0) {
            result = secondDimensionValue * quantityConversion.secondMetric;
            return result == firstDimensionValue;
        } else if (quantityConversion.secondMetric == 0) {
            result = firstDimensionValue * quantityConversion.firstMetric;
            return result == secondDimensionValue;
        } else return firstDimensionValue == secondDimensionValue;
    }
}
