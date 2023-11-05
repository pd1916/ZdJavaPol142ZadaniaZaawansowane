package pl.sdacademy.java.advanced.exercises.day2.task17;

public enum ConversionType {
    METERS_TO_YARDS(1.09),
    YARDS_TO_METERS(0.91),
    CENTIMETERS_TO_INCHES(0.39),
    INCHES_TO_CENTIMETERS(2.54),
    KILOMETERS_TO_MILES(0.62),
    MILES_TO_KILOMETERS(1.61);

    private final double converter;

    ConversionType(double converter) {
        this.converter = converter;
    }

    public double getConverter() {
        return converter;
    }
}
