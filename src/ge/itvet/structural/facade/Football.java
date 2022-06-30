package ge.itvet.structural.facade;

public class Football implements Ball{
    @Override
    public void jump() {
        System.out.println("Football::jump");
    }
}
