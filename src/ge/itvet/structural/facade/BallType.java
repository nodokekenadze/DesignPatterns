package ge.itvet.structural.facade;

public class BallType {
    private Ball football;
    private Ball volleyball;
    private Ball basketball;

    public BallType(){
        football=new Football();
        volleyball=new VolleyBall();
        basketball=new BasketBall();
    }
    public void jumpFootball(){
        football.jump();
    }
    public void jumpVolleyball(){
        volleyball.jump();
    }
    public void jumpBasketball(){
        basketball.jump();
    }
}
