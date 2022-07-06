package lab_12;

public class Tiger extends Animals{

    public Tiger() {

        iFlyBehavior = new WithoutWings();
        iRunBehavior = new FastRunBehavior();
        name = "Tiger";
    }


}
