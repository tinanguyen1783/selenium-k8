package lab_09;

import java.util.ArrayList;

import static lab_09.Animal.Buider;


import java.util.HashMap;
import java.util.List;


public class AnimalsRaceResult {

    public List<Animal> getAnimalWinList(List<Animal> animalList) {

        ArrayList<Animal> animalWinList = new ArrayList<>();
        ArrayList<Animal> animalRaceList = new ArrayList<>();

        for (Animal animal : animalList) {
            if (!animal.isWing()) animalRaceList.add(animal);

        }

        animalWinList.add(animalRaceList.get(0));
        int maxSpeed;

        maxSpeed = animalRaceList.get(0).getAnimalSpeed();

        HashMap<Integer, ArrayList<Animal>> speedRecord = new HashMap<>();
        speedRecord.put(maxSpeed, animalWinList);

        for (int i = 1; i < animalRaceList.size(); i++) {

            if (maxSpeed == animalRaceList.get(i).getAnimalSpeed()) animalWinList.add(animalRaceList.get(i));

            if (maxSpeed < animalRaceList.get(i).getAnimalSpeed()) {

                speedRecord.remove(maxSpeed);
                animalWinList.clear();

                maxSpeed = animalRaceList.get(i).getAnimalSpeed();
                animalWinList.add(animalRaceList.get(i));

                speedRecord.put(maxSpeed, animalWinList);

            }
        }

        return speedRecord.get(maxSpeed);
    }

    public static void main(String[] args) {

        Animal Tiger = new Buider().setAnimalName("Tiger").setAnimalSpeed(100).setisWing(false).buildAnimal();
        Animal Elephant = new Buider().setAnimalName("Elephant").setAnimalSpeed(50).setisWing(false).buildAnimal();
        Animal Snake = new Buider().setAnimalName("Snake").setAnimalSpeed(10).setisWing(false).buildAnimal();
        Animal Dog = new Buider().setAnimalName("Dog").setAnimalSpeed(30).setisWing(false).buildAnimal();
        Animal Penguin = new Buider().setAnimalName("Penguin").setAnimalSpeed(15).setisWing(false).buildAnimal();
        Animal Falcon = new Buider().setAnimalName("Falcon").setAnimalSpeed(120).setisWing(true).buildAnimal();
        Animal Mosquito = new Buider().setAnimalName("Mosquito").setAnimalSpeed(30).setisWing(true).buildAnimal();
        Animal Cat = new Buider().setAnimalName("Cat").setAnimalSpeed(25).setisWing(false).buildAnimal();
        Animal Lion = new Buider().setAnimalName("Lion").setAnimalSpeed(100).setisWing(false).buildAnimal();

        List<Animal> animalList = new ArrayList<>();
        List<Animal> animalWinList = new ArrayList<>();

        animalList.add(Tiger);
        animalList.add(Elephant);
        animalList.add(Snake);
        animalList.add(Dog);
        animalList.add(Penguin);
        animalList.add(Falcon);
        animalList.add(Mosquito);
        animalList.add(Cat);
        animalList.add(Lion);

        animalWinList = new AnimalsRaceResult().getAnimalWinList(animalList);
        String nameOfAnimalWinList = "";

        for (Animal animal : animalList) {
            System.out.printf(" %s : %d (km/h) \n", animal.getAnimalName(), animal.getAnimalSpeed());

        }

        for (int i = 0; i < animalWinList.size(); i++) {

            nameOfAnimalWinList += animalWinList.get(i).getAnimalName();
            if (i < animalWinList.size() - 1) nameOfAnimalWinList += ",";

        }

        System.out.printf("The animals win with speed %d Km/h are %s.", animalWinList.get(0).getAnimalSpeed(), nameOfAnimalWinList);


    }
}