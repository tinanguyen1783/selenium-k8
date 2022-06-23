package lab_08_2;

import java.util.ArrayList;
import java.util.List;

public class AnimalRacing {

    public Animal getAnimalWin(List<Animal> animalList) {
        Animal winAnimal = animalList.get(0);
        for (Animal animal : animalList) {

            if (winAnimal.getSpeed() < animal.getSpeed()) winAnimal = animal;
        }
        return winAnimal;
    }

    public static List<Animal> setAnimalList() {

        int maxSpeed;
        String nameAnimal;
        Animal dog = new Dog();
        Animal horse = new Horse();
        Animal tiger = new Tiger();
        List<Animal> animalList = new ArrayList<>();
        animalList.add(dog);
        animalList.add(horse);
        animalList.add(tiger);

        for (Animal animal : animalList) {

            System.out.printf("%s speed: %d\n", animal.getClass().getSimpleName(), animal.getSpeed());

        }
        return animalList;

    }

    public static void main(String[] args) {

        Animal animalWin = new Animal();
        animalWin = new AnimalRacing().getAnimalWin(AnimalRacing.setAnimalList());
        System.out.printf("Winner is %s, with speed: %d Km/h", animalWin.getClass().getSimpleName(), animalWin.getSpeed());


    }
}