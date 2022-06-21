package lab_09;

public class Animal {

    private String animalName = "";
    private int animalSpeed = 0;
    private boolean isWing = true;

    public Animal(Buider buider) {

        animalName = buider.animalName;
        animalSpeed = buider.animalSpeed;
        isWing = buider.isWing;

    }

    public String getAnimalName() {
        return animalName;
    }

    public int getAnimalSpeed() {
        return animalSpeed;
    }

    public boolean isWing() {
        return isWing;
    }

    public static class Buider {

        private String animalName = "";
        private int animalSpeed = 0;
        private boolean isWing = true;

        public Buider setAnimalName(String animalName) {
            this.animalName = animalName;
            return this;
        }

        public Buider setAnimalSpeed(int animalSpeed) {
            this.animalSpeed = animalSpeed;
            return this;
        }

        public Buider setisWing(boolean isWing) {
            this.isWing = isWing;
            return this;
        }

        public Animal buildAnimal() {
            return new Animal(this);
        }
    }

}
