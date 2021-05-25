package main.java.models;

import main.java.abstraction.Animal;

public class Dog extends Animal {

    public Dog(){}

    public Dog(int age){
        this.setAge(age);
    }

    public Dog(int age, String species){
        this.setAge(age);
        this.setSpecies(species);
    }
}
