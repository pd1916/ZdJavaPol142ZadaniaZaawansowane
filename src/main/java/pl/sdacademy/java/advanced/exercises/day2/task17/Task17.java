package pl.sdacademy.java.advanced.exercises.day2.task17;

import static pl.sdacademy.java.advanced.exercises.day2.task17.ConversionType.INCHES_TO_CENTIMETERS;

public class Task17 {
    public static void main(String[] args) {
        double result = MeasurementConverter.convert(1, INCHES_TO_CENTIMETERS);
        System.out.println(result);


        double resultFunction = MeasurementConverter.convert(5, ConversionTypeWithFunction.METERS_TO_YARDS);
        System.out.println(resultFunction);
    }
}
