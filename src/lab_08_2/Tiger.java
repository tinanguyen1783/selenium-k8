package lab_08_2;

import java.security.SecureRandom;

public class Tiger extends Animal{
    public Tiger() {
        this.speed = this.speed();
        this.name = "Tiger";
    }

    @Override
    public int speed() {
        return new SecureRandom().nextInt(100);
    }
}
