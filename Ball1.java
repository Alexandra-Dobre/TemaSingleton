package singleton;

import java.util.HashMap;
import java.util.Map;

public class Ball1 {

    private static Ball1 ball1;
    private String color;

    private Ball1(String color){
        this.color = color;
    }

    public void bounce(){
        System.out.println("boing!");
    }

    public static Ball1 getInstance(String color) {
        if (ball1 == null) {
            ball1 = new Ball1(color);
        }
        return ball1;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Ball{");
        sb.append("color='").append(color).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
