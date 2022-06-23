package lab_10;

import java.security.SecureRandom;

public abstract class Animal {

    public int speed;

    public Animal() {
    }

    public Animal(int speed, String name) {

        this.speed = speed;
    }
    public int getSpeed() {

        return speed;
    }

    public void setSpeed(int speed) {

        this.speed = speed;
    }

    public abstract int createSpeed();
}
