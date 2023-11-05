package pl.sdacademy.java.advanced.exercises.day2.task17;

public class MeasurementConverter {

    public static double convert(double value, ConversionType conversionType) {
        /*
        cel: metry na jardy
        value: 5 metrów, jardy ???
        type: METERS_TO_YARDS
        5metrów * converter = xxx
        5metrów * 1.09 = ~5,4 jarda
         */
        return value * conversionType.getConverter();
    }

    public static double convert(double value, ConversionTypeWithFunction conversionType) {
        return conversionType.getConverter().apply(value);
    }
}
