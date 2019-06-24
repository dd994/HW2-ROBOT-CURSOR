package main.java.robots;

import main.java.planets.Adaptation;
import main.java.planets.Planet;

import java.util.Random;

public class R1 implements Adaptation {

    private String name;
    private String model;

    public R1(String name, String model) {
        this.name = name;
        this.model = model;
    }

    public R1() {
    }

    public String getName() {
        return name;
    }


    public String getModel() {
        return model;
    }


    public static void about() {
        System.out.println(".... i am the first generated machine engine!");
    }

    public void move() {
        System.out.println(name + ": here we go!");
    }

    public void shout() {
        System.out.println(name + ": I can speak ...");
    }

    public void shoot() {
        System.out.println(name + ": Puff! Puff! Puff!");
    }

    private void armor() {
        System.out.println(name + ": I had strong armor, and nobody can change it!!!");
    }

    public void robotAdaptation() {
        Random letterRandom = new Random();
        char[] letters = "ABC".toCharArray();
        char charChoise = letters[letterRandom.nextInt(letters.length)];
        if (Character.toString(charChoise).equals("A")) {
            adaptation(Planet.SEE);
        } else if (Character.toString(charChoise).equals("B")) {
            adaptation(Planet.SUN);
        } else {
            adaptation(Planet.WIND);
        }
    }

    @Override
    public void adaptation(Planet planet) {
        System.out.println(getName() + " "+getModel()+" adapting to the Planet of the " + planet);
    }

}
