package lab_12;

public class Animals {

    protected String name;
    protected int speed;
    protected IFlyBehavior iFlyBehavior;
    protected IRunBehavior iRunBehavior;

    protected boolean performFly() {
        return iFlyBehavior.flyable();
    }

    protected int performRun() {

        return iRunBehavior.getSpeed();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
