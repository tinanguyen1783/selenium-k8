package lab_08_2;

import java.security.SecureRandom;

public class Animal {

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

    public int speed() {

        return new SecureRandom().nextInt(100);
    }
}
