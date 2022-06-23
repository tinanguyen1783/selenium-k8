package lab_10;

import java.security.SecureRandom;

public class Dog extends Animal {

    public Dog() {
        this.speed = this.createSpeed();
    }

    @Override
    public int createSpeed() {
        return (new SecureRandom().nextInt(60));
    }
}
