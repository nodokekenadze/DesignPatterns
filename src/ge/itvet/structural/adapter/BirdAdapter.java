package ge.itvet.structural.adapter;

public class BirdAdapter implements Penguin{
    Bird bird;
    public BirdAdapter(Bird bird){
        this.bird=bird;
    }
    @Override
    public void swim() {
        bird.makeSound();
    }
}
