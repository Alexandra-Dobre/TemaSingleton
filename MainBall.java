package singleton;

public class MainBall {
    public static void main(String[] args) {
        Ball ballRed = Ball.getInstance("red - Ball");
        System.out.println(ballRed.toString());

        Ball ballBlue = Ball.getInstance("blue - Ball");
        System.out.println(ballBlue.toString());

        Ball ballViolet = Ball.getInstance("violet - Ball");
        System.out.println(ballViolet.toString());

        System.out.println("======================");

        Ball1 ball1Green = Ball1.getInstance("green - Ball1");
        System.out.println(ball1Green.toString());

        Ball1 ball1Grey = Ball1.getInstance("grey - Ball1");
        System.out.println(ball1Grey.toString());
    }
}
