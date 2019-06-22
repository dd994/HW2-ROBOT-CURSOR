import java.util.Random;

public class Robot_v1 {
    String name;

    public Robot_v1(String name) {
        this.name = name;
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


}
