package lab_10;


import java.security.SecureRandom;

public class Tiger extends Animal {
    public Tiger() {
        this.speed = this.createSpeed();
    }

    @Override
    public int createSpeed() {
        return new SecureRandom().nextInt(100);
    }
}
