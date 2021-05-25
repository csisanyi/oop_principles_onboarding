package main.java.models;

import main.java.abstraction.Animal;

public class Cat extends Animal {

    public Cat(){}

    public Cat(int age){
        this.setAge(age);
    }

    public Cat(int age, String species){
        this.setAge(age);
        this.setSpecies(species);
    }

}
