package main.java.models;

import main.java.abstraction.Animal;

public class Fish extends Animal {

    public Fish(){}

    public Fish(int age){
        this.setAge(age);
    }

    public Fish(int age, String species){
        this.setAge(age);
        this.setSpecies(species);
    }
}
