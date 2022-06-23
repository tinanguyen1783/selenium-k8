package lab_10;

import lab_08_2.Animal;
import lab_08_2.Dog;
import lab_08_2.Horse;
import lab_08_2.Tiger;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AnimalRacing {

    public void getAnimalWin(List<lab_08_2.Animal> animalList) {

        ArrayList<lab_08_2.Animal> animalWinList = new ArrayList<>();
        animalWinList.add(animalList.get(0));

        int maxSpeed;
        maxSpeed = animalList.get(0).getSpeed();

        HashMap<Integer, ArrayList<lab_08_2.Animal>> speedRecord = new HashMap<>();
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

        String nameOfAnimalWinList = "";

        for (int i = 0; i < animalWinList.size(); i++) {

            nameOfAnimalWinList += animalWinList.get(i).getClass().getSimpleName();
            if (i < animalWinList.size() - 1) nameOfAnimalWinList += ",";

        }

        System.out.printf("The animals win with speed %d Km/h is (are) %s.", animalWinList.get(0).getSpeed(), nameOfAnimalWinList);

    }

    public static List<lab_08_2.Animal> setAnimalList() {

        String nameAnimal;
        lab_08_2.Animal dog = new Dog();
        lab_08_2.Animal horse = new Horse();
        lab_08_2.Animal tiger = new Tiger();

//        dog.setSpeed(9);
//        horse.setSpeed(30);
//        tiger.setSpeed(30);

        List<lab_08_2.Animal> animalList = new ArrayList<>();
        List<lab_08_2.Animal> animalWinList = new ArrayList<>();

        animalList.add(dog);
        animalList.add(horse);
        animalList.add(tiger);
        for (Animal animal : animalList) {

            System.out.printf("%s speed: %d\n", animal.getClass().getSimpleName(), animal.getSpeed());

        }

        return animalList;

    }

    public static void main(String[] args) {

        AnimalRacing animalRacingBonus = new AnimalRacing();
        animalRacingBonus.getAnimalWin(setAnimalList());

    }

}
