import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Robot_v1 ironMan1 = new Robot_v1("Iron Man");
        Robot_v2 ironMan2 = new Robot_v2("Iron Man 2");
        Robot_v3 ironMan3 = new Robot_v3("Iron Man 3");


        ironMan1.move();
        ironMan2.shout();
        ironMan3.shoot();
        robotVersionGenerator();
    }

    public static int robotVersionGenerator() {
        Random random = new Random();
        int a = random.nextInt(12);
        System.out.println(a);
        if (a <= 3) {
            System.out.println("Selected form 1");
            Robot_v1.about();
        } else if (a > 3 && a <= 8) {
            System.out.println("Selected form 2");
            Robot_v2.about();
        } else if (a > 9 && a <= 12) {
            System.out.println("Selected form 3");
            Robot_v3.about();
        }
        return a;

    }
}
