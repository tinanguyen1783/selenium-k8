package lab_12;

public class Elephant extends Animals {

    public Elephant() {
        iFlyBehavior = new WithoutWings();
        iRunBehavior = new SlowRunBehaviour();
        name = "Elephant";

    }
}
