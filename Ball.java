package singleton;

import java.util.HashMap;
import java.util.Map;

public class Ball {
    // using map
    private static Map<String, Ball> ballColor = new HashMap<>();

    private String color;

    private Ball(String color){
        this.color = color;
    }

    public void bounce(){
        System.out.println("boing!");
    }

    public static Ball getInstance(String color) {
        if (!ballColor.containsKey(color)) {
            ballColor.put(color, new Ball(color));
        }
        return ballColor.get(color);
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Ball{");
        sb.append("color='").append(color).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
