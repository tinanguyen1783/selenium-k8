package lab_08_2;

import java.security.SecureRandom;

public class Horse extends Animal {
    public Horse() {
        this.speed = this.speed();
    }

    @Override
    public int speed() {

        return (new SecureRandom().nextInt(75));
    }
}
