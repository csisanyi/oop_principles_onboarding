package main.java.controllers;

import main.java.models.Cat;

public class CatController {

    private final Cat cat;

    public CatController(Cat cat) {
        this.cat = cat;
    }

    public void meow(){
        System.out.println("Meow");
    }

    public String getSpecies() {
        return cat.getSpecies();
    }

    public void setSpecies(String species) {
        cat.setSpecies(species);
    }

    public int getAge() {
        return cat.getAge();
    }

    public void setAge(int age) {
        cat.setAge(age);
    }

}
