package singleton;

public class SantaClaus {
    private static SantaClaus santaClaus;
    private String presents;

    private SantaClaus(String presents) {
        this.presents = presents;
    }

    public void setGivingPresents() {
        System.out.println("Santa Claus is giving presents!");
    }

    public static SantaClaus getInstance(String presents){
        if(santaClaus == null) {
            santaClaus = new SantaClaus(presents);
        }
        return santaClaus;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SantaClaus{");
        sb.append("presents='").append(presents).append('\'');
        sb.append('}');
        return sb.toString();
    }


}
