package pl.sdacademy.java.advanced.exercises.day1.task8;

public class ParcelValidator implements Validator {
    private static final int TOTAL_MAX_LENGTH = 300;
    private static final int SINGLE_MIN_LENGTH = 30;
    private static final int MAX_WEIGHT_FOR_EXPRESS = 15;
    private static final int MAX_WEIGHT_FOR_NON_EXPERT = 30;

    @Override
    public boolean validate(Parcel input) {
        return isAllDimensionsAreMoreThan30(input)
                && isSumOfXYZLessThan300(input)
                && isCorrectWeight(input);
    }

    private static boolean isCorrectWeight(Parcel input) {
        return (input.isExpress() && input.getWeight() <= MAX_WEIGHT_FOR_EXPRESS)
                || (!input.isExpress() && input.getWeight() <= MAX_WEIGHT_FOR_NON_EXPERT);
    }

    private static boolean isAllDimensionsAreMoreThan30(Parcel input) {
        return input.getxLength() >= SINGLE_MIN_LENGTH
                && input.getyLength() >= SINGLE_MIN_LENGTH
                && input.getzLength() >= SINGLE_MIN_LENGTH;
    }

    private static boolean isSumOfXYZLessThan300(Parcel input) {
        return input.getxLength() + input.getyLength() + input.getzLength() <= TOTAL_MAX_LENGTH;
    }
}
