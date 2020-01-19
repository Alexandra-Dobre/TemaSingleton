package singleton;

public class MainSantaClaus {
    public static void main(String[] args) {

        SantaClaus santaClaus = SantaClaus.getInstance("Doll");
        System.out.println(santaClaus.toString());
        santaClaus.setGivingPresents();

        System.out.println("=============================");

        SantaClaus santaClaus1 = SantaClaus.getInstance("Teddy Bear");
        System.out.println(santaClaus1.toString());


    }
}
