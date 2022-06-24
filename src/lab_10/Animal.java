package lab_10;

import java.security.SecureRandom;

public abstract class Animal {

    public int speed;

    public int getSpeed() {

        return speed;
    }

   public abstract int createSpeed();
}
