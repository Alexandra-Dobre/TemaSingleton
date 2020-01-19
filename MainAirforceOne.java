package singleton;

public class MainAirforceOne {
    public static void main(String[] args) {

        AirforceOne airforceOne = AirforceOne.getInstance("President of USA");
        System.out.println(airforceOne.toString());
        airforceOne.setAirforceOneisFlying();

        AirforceOne airforceOne2 = AirforceOne.getInstance("President of America");
        System.out.println(airforceOne2.toString());
    }

}
