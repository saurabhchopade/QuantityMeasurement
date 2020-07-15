package com.bridgelabz.quantitymeasurement.service;

import com.bridgelabz.quantitymeasurement.util.Units;

import static java.lang.Math.round;

public class LengthConverter {
    double value;
    Units units;

    /**
     * Constructor
     *
     * @param value
     * @param units
     */
    public LengthConverter(Double value, Units units) {
        this.units = units;
        this.value = value;
    }

    /**
     * Compare to lengths
     *
     * @param secondLength
     * @return
     */
    public boolean compare(LengthConverter secondLength) {
        Double length1 = (double) round(this.units.getValue() * this.value);
        Double length2 = (double) round(secondLength.units.getValue() * secondLength.value);
        return (length1.compareTo(length2) == 0);
    }

    /**
     * Compare is for comparing Quantity after merging two quantity to each other
     *
     * @param quantity1
     * @param quantity2
     * @return
     */
    public boolean compare(LengthConverter quantity1, LengthConverter quantity2) {
        Double length1 = (double) round(this.units.getValue() * this.value);
        Double length2 = (double) round(mergeQuantity(quantity1, quantity2));
        return (length1.compareTo(length2) == 0);
    }

    /**
     * It will merge two quantities each other
     *
     * @param quantity1
     * @param quantity2
     * @return
     */
    public Double mergeQuantity(LengthConverter quantity1, LengthConverter quantity2) {
        Double length1 = quantity1.units.getValue() * quantity1.value;
        Double length2 = quantity2.units.getValue() * quantity2.value;
        return length1 + length2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LengthConverter length = (LengthConverter) o;
        return Double.compare(length.value, value) == 0;
    }
}
