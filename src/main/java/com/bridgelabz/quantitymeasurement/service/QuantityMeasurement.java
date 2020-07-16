package com.bridgelabz.quantitymeasurement.service;

import com.bridgelabz.quantitymeasurement.enums.Units;
import com.bridgelabz.quantitymeasurement.exception.QuantityException;

import static java.lang.Math.abs;
import static java.lang.Math.round;

public class QuantityMeasurement extends AddQuantity {
    double value;
    Units units;


    /**
     * Constructor
     *
     * @param value
     * @param units
     */
    public QuantityMeasurement(Double value, Units units) {
        this.units = units;
        this.value = value;
    }

    /**
     * Compare to lengths
     *
     * @param that
     * @return
     */
    public boolean compare(QuantityMeasurement that) {
        Double length1 = (double) abs(round(this.units.getValue() * this.value));
        Double length2 = (double) abs(round(that.units.getValue() * that.value));
        return (length1.compareTo(length2) == 0);
    }

    /**
     * Compare is for comparing Quantity after merging two quantity to each other
     *
     * @param quantity1
     * @param quantity2
     * @return
     */
    public boolean compare(QuantityMeasurement quantity1, QuantityMeasurement quantity2) throws QuantityException {
        try {
            Double length1 = (double) round(this.units.getValue() * this.value);
            Double length2 = (double) round(addTwoQuantity(quantity1, quantity2));
            return (length1.compareTo(length2) == 0);
        } catch (NullPointerException e) {
            throw new QuantityException(QuantityException.ExceptionType.GIVENNULLVALUE, "Enter Proper input");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuantityMeasurement length = (QuantityMeasurement) o;
        return Double.compare(length.value, value) == 0;
    }
}
