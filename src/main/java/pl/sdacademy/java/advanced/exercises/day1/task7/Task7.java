package pl.sdacademy.java.advanced.exercises.day1.task7;

public class Task7 {
    public static void main(String[] args) {
        WeaponClip weaponClip = new WeaponClip(3);
        weaponClip.loadBullet("nabój_1");
        weaponClip.loadBullet("nabój_2");
        weaponClip.loadBullet("nabój_3");
        //weaponClip.loadBullet("nabój_4"); // spodziewamy się wyjątku

        weaponClip.shot();
        weaponClip.shot();
        weaponClip.shot();

        weaponClip.shot(); // spodziewamy się komuniaktu o pustym magazynku
    }
}
