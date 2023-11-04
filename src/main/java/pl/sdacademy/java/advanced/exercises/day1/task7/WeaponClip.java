package pl.sdacademy.java.advanced.exercises.day1.task7;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class WeaponClip {
    private final int maxNumberOfBulletInClip;
    //private final Stack<String> weaponClip = new Stack<>();
    private final Deque<String> weaponClip = new ArrayDeque<>();

    public WeaponClip(int capacity) {
        this.maxNumberOfBulletInClip = capacity;
    }

    public void loadBullet(String bullet) {
        if(weaponClip.size() == maxNumberOfBulletInClip) {
            throw new IllegalArgumentException("Clip is full");
        }
        //weaponClip.add(bullet);
        weaponClip.push(bullet);
    }

    public boolean loadBulletAsBoolean(String bullet) {
        if(weaponClip.size() == maxNumberOfBulletInClip) {
            return false;
        }
        weaponClip.add(bullet);
        return true;
    }

    public boolean isLoaded() {
        return weaponClip.size() >= 1;
        //return !weaponClip.isEmpty();
    }

    public void shot() {
        if(isLoaded()) {
            String bullet = weaponClip.pop();
            System.out.println(bullet);
        } else {
            System.out.println("pusty maganazynek");
        }
    }
}
