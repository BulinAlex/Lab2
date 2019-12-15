package Ball;
public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball( "pink", "bowling");
        Ball b2 = new Ball( "orange", "basketball");
        Ball b3 = new Ball( "brown", "football");

        b3.setColor("black");

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    }
}