package com.bridgelabz.quantitymeasurement.service;

import com.bridgelabz.quantitymeasurement.util.Units;

public class Length {
    double value;
    Units units;

    /**
     * Constructor
     * @param value
     * @param units
     */
    public Length(Double value, Units units) {
        this.units = units;
        this.value = value;
    }

    /**
     * Compare to lengths
     * @param secondLength
     * @return
     */
    public boolean compare(Length secondLength) {
        Double value1 = this.units.getValue() * this.value;
        Double value2 = secondLength.units.getValue() * secondLength.value;
        return (value1.compareTo(value2) == 0);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Length length = (Length) o;
        return Double.compare(length.value, value) == 0;
    }
}
