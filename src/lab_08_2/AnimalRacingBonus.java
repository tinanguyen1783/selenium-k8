package lab_08_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AnimalRacingBonus {

    public List<Animal> getAnimalWin(List<Animal> animalList) {

        ArrayList<Animal> animalWinList = new ArrayList<>();
        animalWinList.add(animalList.get(0));

        int maxSpeed;
        maxSpeed = animalList.get(0).getSpeed();

        HashMap<Integer, ArrayList<Animal>> speedRecord = new HashMap<>();
        speedRecord.put(maxSpeed, animalWinList);

        for (int i = 1; i < animalList.size(); i++) {

            if (maxSpeed == animalList.get(i).getSpeed()) animalWinList.add(animalList.get(i));

            if (maxSpeed < animalList.get(i).getSpeed()) {

                speedRecord.remove(maxSpeed);
                animalWinList.clear();

                maxSpeed = animalList.get(i).getSpeed();
                animalWinList.add(animalList.get(i));

                speedRecord.put(maxSpeed, animalWinList);

            }
        }

        return speedRecord.get(maxSpeed);
    }

    public static void main(String[] args) {

        int maxSpeed;
        String nameAnimal;
        Animal dog = new Dog();
        Animal horse = new Horse();
        Animal tiger = new Tiger();

        dog.setSpeed(9);
        horse.setSpeed(30);
        tiger.setSpeed(30);

        List<Animal> animalList = new ArrayList<>();
        List<Animal> animalWinList = new ArrayList<>();

        animalList.add(dog);
        animalList.add(horse);
        animalList.add(tiger);

        animalWinList = new AnimalRacingBonus().getAnimalWin(animalList);
        String nameOfAnimalWinList = "";

        for (Animal animal : animalList) {

            System.out.printf("%s speed: %d\n", animal.getClass().getSimpleName(), animal.getSpeed());

        }
        for (int i = 0; i < animalWinList.size(); i++) {

            nameOfAnimalWinList += animalWinList.get(i).getClass().getSimpleName();
            if (i < animalWinList.size() - 1) nameOfAnimalWinList += ",";

        }

        System.out.printf("The animals win with speed %d Km/h are %s.", animalWinList.get(0).getSpeed(), nameOfAnimalWinList);
    }

}
