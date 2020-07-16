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
    public boolean compare(QuantityMeasurement that) throws QuantityException {
        if (that.units.type == this.units.type) {
            switch (that.units.type) {
                case TEMPERATURE:
                    Double quantity1 = (double) abs(round((this.units.getValue() * this.value + 32)));
                    Double quantity2 = (double) abs(round(that.units.getValue() * that.value));
                    return (quantity1.compareTo(quantity2) == 0);
                default:
                    Double length1 = (double) abs(round(this.units.getValue() * this.value));
                    Double length2 = (double) abs(round(that.units.getValue() * that.value));
                    return (length1.compareTo(length2) == 0);
            }
        }
        throw new QuantityException(QuantityException.ExceptionType.ILLEGALTYPE, "PLEASE PROVIDE SIMILAR TYPE QUANTITY");
    }

    /**
     * Compare is for comparing Quantity after merging two quantity to each other
     *
     * @param that1
     * @param that2
     * @return
     */
    public boolean compare(QuantityMeasurement that1, QuantityMeasurement that2) throws QuantityException {
        try {
            if (that1.units.type == that2.units.type) {
                Double length1 = (double) round(this.units.getValue() * this.value);
                Double length2 = (double) round(addTwoQuantity(that1, that2));
                return (length1.compareTo(length2) == 0);
            }
            throw new QuantityException(QuantityException.ExceptionType.ILLEGALTYPE, "PLEASE PROVIDE SIMILAR TYPE QUANTITY");
        } catch (NullPointerException e) {
            throw new QuantityException(QuantityException.ExceptionType.GIVENNULLVALUE, "ENTER PROPER INPUT");
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
