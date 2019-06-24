import java.util.Random;

public class R1 implements SeaPlanetA, SunPlanetC, WindPlanetB {

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

    public void planetTransformation() {
        Random letterRandom = new Random();
        char[] letters = "ABC".toCharArray();
        char charChoise = letters[letterRandom.nextInt(letters.length)];
        if (Character.toString(charChoise).equals("A")) {
            adaptToSea();
        } else if (Character.toString(charChoise).equals("B")) {
            adaptToWind();
        } else {
            adaptToSun();
        }
    }

    @Override
    public void adaptToSea() {
        System.out.println(getName() + " " + getModel() + "  adapted to the sea planet, feeling good!");
    }

    @Override
    public void adaptToSun() {
        System.out.println(getName() + " " + getModel() + "  adapted to the sun planet, feeling great!");
    }

    @Override
    public void adaptToWind() {
        System.out.println(getName() + " " + getModel() + "  adapted to the wind planet, feeling cool!");
    }
}
