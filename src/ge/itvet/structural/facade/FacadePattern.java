package ge.itvet.structural.facade;

public class FacadePattern {
    public static void main(String[] args) {
        BallType ballType=new BallType();

        ballType.jumpBasketball();
        ballType.jumpFootball();
        ballType.jumpVolleyball();
    }
}
