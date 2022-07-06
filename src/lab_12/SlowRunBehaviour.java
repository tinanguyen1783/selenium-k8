package lab_12;

import java.security.SecureRandom;

public class SlowRunBehaviour implements IRunBehavior {
    @Override
    public int getSpeed() {
        return new SecureRandom().nextInt(10);
    }
}
