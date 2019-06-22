public class Robot_v2 extends Robot_v1 {
    public Robot_v2(String name) {
        super(name);
    }

    @Override
    public void shoot() {
        System.out.println(name + ": I am shoot from grenade launcher");
    }

    public static void about() {
        System.out.println("I am second version, and i am better then first, because i have a grenade launcher");
    }
}
