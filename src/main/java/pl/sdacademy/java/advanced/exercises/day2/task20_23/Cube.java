package pl.sdacademy.java.advanced.exercises.day2.task20_23;

public class Cube extends Shape3D implements Fillable {
    private final int a;

    public Cube(int a) {
        this.a = a;
    }

    @Override
    double calculatePerimeter() {
        return 12 * a;
    }

    @Override
    double calculateVolume() {
        // a^3
        return Math.pow(a, 3);
    }

    /*
    return:
    0 -> napełni figurę wodą po brzegi
    -1 ->  za mało wody
    1 -> za dużo wody
     */
    @Override
    public int fill(double volume) {
        double maxVolume = calculateVolume();
//        if(maxVolume == volume) {
//            return 0;
//        } else if(maxVolume < volume) {
//            return 1;
//        }
//        return -1;
        return Double.compare(volume, maxVolume);
    }
}
