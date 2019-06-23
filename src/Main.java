import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        int a = random.nextInt(13);
        if (a > 0 && a <= 3) {
            System.out.println("Selected form 1");
            R1 bot1 = new R1("Ironman", "V1");
            System.out.println("My name is " + bot1.getName()+" version "+bot1.getModel());
            bot1.about();
        } else if (a > 3 && a <= 8) {
            System.out.println("Selected form 2");
            R2 bot2 = new R2("Ironman", "V2");
            System.out.println("My name is " + bot2.getName()+" version "+bot2.getModel());
            bot2.about();
            bot2.shoot();
        } else {
            System.out.println("Selected form 3");
            R3 bot3 = new R3("Ironman", "V3");
            System.out.println("My name is " + bot3.getName()+" version "+bot3.getModel());
            bot3.about();
            bot3.fly();
        }
    }

}
