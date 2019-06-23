
public class R1 {

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
}
