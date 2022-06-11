package lab_08_2;

import java.util.ArrayList;
import java.util.List;

public class AnimalRacing {

    public static void main(String[] args) {

        int maxSpeed;
        String nameAnimal;

        Animal dog = new Dog();
        Animal horse = new Horse();
        Animal tiger = new Tiger();

        System.out.println("Racing start:");
        System.out.println("Dog speed " + dog.getSpeed() + " Km/h");
        System.out.println("Horse speed " + horse.getSpeed() + " Km/h");
        System.out.println("Tiger speed " + tiger.getSpeed() + " Km/h");

        if (dog.getSpeed() > horse.getSpeed()) {
            maxSpeed = dog.getSpeed();
            nameAnimal = dog.getName();

        } else {
            maxSpeed = horse.getSpeed();
            nameAnimal = horse.getName();
        }

        if (maxSpeed < tiger.getSpeed()) {
            maxSpeed = tiger.getSpeed();
            nameAnimal = tiger.getName();
        }
        System.out.println("Winner is " + nameAnimal + " with speed: " + maxSpeed + " Km/h");

    }

}
