package lab_12;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnimalsRacing {

    static void getAnimalWin(List<Animals> animalsList) {

        int speedAnimal, currentspeed;
        String animalWinName;

        List<Animals> animalWithoutWingList = new ArrayList<>();
        List<Animals> animalWinList = new ArrayList<>();

        System.out.print("Animal race list: ");
        for (Animals animals : animalsList) {
            if (!animals.performFly()) animalWithoutWingList.add(animals);
            System.out.print("  " + animals.name);
        }

        speedAnimal = animalWithoutWingList.get(0).performRun();
        animalWinList.add(animalWithoutWingList.get(0));

        System.out.println(" \nAnimals without wing list:");
        System.out.println(animalWinList.get(0).name + "  " + speedAnimal);

        for (int i = 1; i < animalWithoutWingList.size(); i++) {

            currentspeed = animalWithoutWingList.get(i).performRun();

            System.out.println(animalWithoutWingList.get(i).name + " " + currentspeed);
            if (currentspeed == speedAnimal) animalWinList.add(animalWithoutWingList.get(i));
            if (currentspeed > speedAnimal) {
                speedAnimal = currentspeed;
                animalWinList.clear();
                animalWinList.add(animalWithoutWingList.get(i));
            }


        }

        System.out.print("Animal win list is(are) ");

        for (Animals animals : animalWinList) {

            System.out.print ( "  " + animals.name);

        }

    }

    public static void main(String[] args) {

        AnimalsRacing.getAnimalWin(Arrays.asList(new Cat(), new Dog(), new Elephant(), new Falcon(), new Tiger()));
    }

}
