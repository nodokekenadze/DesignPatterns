package ge.itvet.structural.adapter;

public class Eagle implements Bird{
    @Override
    public void fly() {
        System.out.println("Flying");
    }

    @Override
    public void makeSound() {
        System.out.println(".");
    }
}
