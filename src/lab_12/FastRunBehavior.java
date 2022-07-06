package lab_12;

import java.security.SecureRandom;

public class FastRunBehavior implements IRunBehavior {
    @Override
    public int getSpeed() {
        return new SecureRandom().nextInt(100);
    }
}
