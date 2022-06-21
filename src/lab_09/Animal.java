package lab_09;

public class Animal {

    private String animalName = "";
    private int animalSpeed = 0;
    private boolean isWing = true;

    protected Animal(Builder builder) {

        animalName = builder.animalName;
        animalSpeed = builder.animalSpeed;
        isWing = builder.isWing;

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

    public static class Builder {

        private String animalName = "";
        private int animalSpeed = 0;
        private boolean isWing = true;

        public Builder setAnimalName(String animalName) {
            this.animalName = animalName;
            return this;
        }

        public Builder setAnimalSpeed(int animalSpeed) {
            this.animalSpeed = animalSpeed;
            return this;
        }

        public Builder setisWing(boolean isWing) {
            this.isWing = isWing;
            return this;
        }

        public Animal buildAnimal() {
            return new Animal(this);
        }
    }

}
