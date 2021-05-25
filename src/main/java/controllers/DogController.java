package main.java.controllers;

import main.java.models.Dog;

public class DogController {

    private final Dog dog;

    public DogController(Dog dog) {
        this.dog = dog;
    }

    public void bark(){
        System.out.println("Wouf wouf");
    }

    public String getSpecies() {
        return dog.getSpecies();
    }

    public void setSpecies(String species) {
        dog.setSpecies(species);
    }

    public int getAge() {
        return dog.getAge();
    }

    public void setAge(int age) {
        dog.setAge(age);
    }
}
