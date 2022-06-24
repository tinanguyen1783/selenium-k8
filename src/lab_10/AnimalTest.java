package lab_10;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnimalTest {

    public void getAnimalWin(List<Animal> animalList) {

        ArrayList<Animal> animalWinList = new ArrayList<>();
        animalWinList.add(animalList.get(0));

        int maxSpeed;
        maxSpeed = animalList.get(0).getSpeed();


        for (int i = 1; i < animalList.size(); i++) {

            if (maxSpeed == animalList.get(i).getSpeed()) animalWinList.add(animalList.get(i));

            if (maxSpeed < animalList.get(i).getSpeed()) {

                animalWinList.clear();

                maxSpeed = animalList.get(i).getSpeed();
                animalWinList.add(animalList.get(i));

            }
        }

        String nameOfAnimalWinList = "";

        for (int i = 0; i < animalWinList.size(); i++) {

            nameOfAnimalWinList += animalWinList.get(i).getClass().getSimpleName();
            if (i < animalWinList.size() - 1) nameOfAnimalWinList += ",";

        }

        System.out.printf("The animals win with speed %d Km/h is (are) %s.", animalWinList.get(0).getSpeed(), nameOfAnimalWinList);

    }

    public static List<Animal> setAnimalList() {

        String nameAnimal;
        Animal dog = new Dog();
        Animal horse = new Horse();
        Animal tiger = new Tiger();

        List<Animal> animalList = new ArrayList<>();
        animalList = Arrays.asList(dog, horse, tiger);

        for (Animal animal : animalList) {

            System.out.printf("%s speed: %d\n", animal.getClass().getSimpleName(), animal.getSpeed());

        }

        return animalList;

    }

    public static void main(String[] args) {

        AnimalTest animalRacing = new AnimalTest();
        animalRacing.getAnimalWin(setAnimalList());

    }

}
