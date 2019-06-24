package main.java.robots;

public class R2 extends R1 {

    public R2(String name, String model) {
        super(name, model);
    }

    @Override
    public void shoot() {
        System.out.println(getName() + " " + getModel() + ": I am shoot from grenade launcher");
    }

    public static void about() {
        System.out.println("I am second version, and i am better then first, because i have a grenade launcher");
    }
}
