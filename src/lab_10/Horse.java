package lab_10;


import java.security.SecureRandom;

public class Horse extends Animal {
    public Horse() {
        this.speed = this.createSpeed();
    }

    @Override
    public int createSpeed() {

        return (new SecureRandom().nextInt(75));
    }
}
