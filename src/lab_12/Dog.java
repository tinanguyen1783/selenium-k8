package lab_12;

public class Dog extends Animals{

    public Dog() {

        iFlyBehavior = new WithoutWings();
        iRunBehavior = new MediumRunBehaviour();
        name = "Dog";
    }
}
