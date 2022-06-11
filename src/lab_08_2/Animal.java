package lab_08_2;

import java.security.SecureRandom;

public class Animal {

    public int speed;
    public String name;

    public Animal() {
    }

    public Animal(int speed, String name) {
        this.speed = speed;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
