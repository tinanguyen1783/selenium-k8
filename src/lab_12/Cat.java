package lab_12;

public class Cat extends Animals {
    public Cat() {

        iFlyBehavior = new WithoutWings();
        iRunBehavior = new MediumRunBehaviour();
        name = "Cat";
    }
}
