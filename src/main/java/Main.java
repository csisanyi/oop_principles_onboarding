package main.java;

import main.java.controllers.CatController;
import main.java.controllers.DogController;
import main.java.controllers.FishController;
import main.java.models.Cat;
import main.java.models.Dog;
import main.java.models.Fish;

public class Main {

    public static void main(String[] args) {

        CatController cat = new CatController(new Cat(1, "Bengal"));
        DogController dog = new DogController(new Dog(2));
        FishController fish = new FishController(new Fish());

        dog.setSpecies("Chiwawa");

        fish.setAge(2);
        fish.setSpecies("Salmon");

        cat.meow();
        dog.bark();
        fish.swim();

    }
}
