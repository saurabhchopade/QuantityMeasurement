package com.bridgelabz.quantitymeasurement.service;

public class AddQuantity {
    /**
     * Add will combine two quantity each other
     * @param quantity1
     * @param quantity2
     * @return
     */
    public Double addTwoQuantity(QuantityMeasurement quantity1, QuantityMeasurement quantity2) {
        Double length1 = quantity1.units.getValue() * quantity1.value;
        Double length2 = quantity2.units.getValue() * quantity2.value;
        return length1 + length2;
    }
}
