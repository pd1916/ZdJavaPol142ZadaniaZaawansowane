package pl.sdacademy.java.advanced.exercises.day1.task8;

public class Task8 {
    public static void main(String[] args) {
        ParcelValidator parcelValidator = new ParcelValidator();

        Parcel parcel = new Parcel(35, 40, 45, 14, true);
        boolean result = parcelValidator.validate(parcel);
        System.out.println("spodziewamy się true: " + result);

        parcel = new Parcel(25, 40, 45, 14, true);
        result = parcelValidator.validate(parcel);
        System.out.println("spodziewamy się false: " + result);

        parcel = new Parcel(35, 25, 45, 14, true);
        result = parcelValidator.validate(parcel);
        System.out.println("spodziewamy się false: " + result);

        parcel = new Parcel(35, 40, 25, 14, true);
        result = parcelValidator.validate(parcel);
        System.out.println("spodziewamy się false: " + result);

        parcel = new Parcel(35, 40, 45, 16, true);
        result = parcelValidator.validate(parcel);
        System.out.println("spodziewamy się false: " + result);

        parcel = new Parcel(100, 100, 101, 14, true);
        result = parcelValidator.validate(parcel);
        System.out.println("spodziewamy się false: " + result);
    }
}
