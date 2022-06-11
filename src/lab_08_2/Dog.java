package lab_08_2;

import java.security.SecureRandom;

public class Dog extends Animal {

    public Dog() {
        this.speed = this.speed();
        this.name = "Dog";
    }

    @Override
    public int speed() {
        return (new SecureRandom().nextInt(60));
    }
}
