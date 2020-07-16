package com.bridgelabz.quantitymeasurement.enums;

public enum Units {

    FEET(Type.LENGTH, 100),INCH(Type.LENGTH,8.33),
    YARD(Type.LENGTH,300), CM(Type.LENGTH,3.28),
    KG(Type.WEIGHT,1000), GRAM(Type.WEIGHT,1),
    TONNE(Type.WEIGHT,1000000),
    LITRE(Type.VOLUME,1000), GALLON(Type.VOLUME,3784.58),
    ML(Type.VOLUME,1),
    CELCIUS(Type.TEMPERATURE,1.8), FAHRENHEIT(Type.TEMPERATURE,1);

    public enum Type {
        LENGTH,WEIGHT,VOLUME,TEMPERATURE;
    }

    public final Type type;
    double value;

    Units(Type type, double value) {
        this.type = type;
        this.value = value;
    }

    public double getValue() {
        return this.value;
    }
}
