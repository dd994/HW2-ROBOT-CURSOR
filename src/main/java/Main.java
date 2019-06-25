package main.java;

import main.java.robots.R1;
import main.java.robots.R2;
import main.java.robots.R3;

public class Main {
    public static void main(String[] args) {

        int rndNum = 1 + (int)(Math.random() * 11);

        if (rndNum <= 3) {
            R1 bot1 = new R1("Ironman", "V1");
            System.out.println("My name is " + bot1.getName() + " version " + bot1.getModel());
            bot1.about();
            bot1.shout();
            System.out.println("...robot arrived on the planet with aliens");
            bot1.robotAdaptation();


        } else if (rndNum <= 8) {
            R2 bot2 = new R2("Ironman", "V2");
            System.out.println("My name is " + bot2.getName() + " version " + bot2.getModel());
            bot2.about();
            bot2.shoot();
            bot2.move();
            System.out.println("...robot arrived on the plane with aliens");
            bot2.robotAdaptation();


        } else {
            R3 bot3 = new R3("Ironman", "V3");
            System.out.println("My name is " + bot3.getName() + " version " + bot3.getModel());
            bot3.about();
            bot3.fly();
            System.out.println("...robot arrived on the planet with aliens");
            bot3.robotAdaptation();
        }

    }


}
