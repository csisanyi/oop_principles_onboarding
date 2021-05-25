package main.java.controllers;

import main.java.models.Fish;

public class FishController {

    public final Fish fish;

    public FishController(Fish fish) {
        this.fish = fish;
    }

    public void swim() {
        System.out.println("<-> </> <\\> <->");
    }

    public String getSpecies() {
        return fish.getSpecies();
    }

    public void setSpecies(String species) {
        fish.setSpecies(species);
    }

    public int getAge() {
        return fish.getAge();
    }

    public void setAge(int age) {
        fish.setAge(age);
    }
}
