package lab_12;

public class Falcon extends Animals{

    public Falcon() {

        iFlyBehavior = new Withwings();
        iRunBehavior = new MediumRunBehaviour();
        name = "Falcon";

    }
}
