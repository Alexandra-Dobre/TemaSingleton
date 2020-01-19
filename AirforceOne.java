package singleton;

public class AirforceOne {
    private static AirforceOne airforceOne;
    private String president;

    private AirforceOne(String president){

        this.president = president;
    }

    public void setAirforceOneisFlying(){

        System.out.println("Is flying!");
    }

    public static AirforceOne getInstance(String president) {
        if (airforceOne == null) {
            airforceOne = new AirforceOne(president);
        }
        return airforceOne;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AirforceOne{");
        sb.append("president='").append(president).append('\'');
        sb.append('}');
        return sb.toString();
    }

}
