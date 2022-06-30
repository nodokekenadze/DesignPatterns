package ge.itvet.structural.adapter;

public class Main {
    public static void main(String[] args) {
        Eagle eagle=new Eagle();
        PolarPenguin penguin= new PolarPenguin();
        Penguin birdAdapter=new BirdAdapter(eagle);

        System.out.println("Eagle...");
        eagle.fly();
        eagle.makeSound();

        System.out.println("PolarPenguin...");
        penguin.swim();

        System.out.println("BirdAdapter...");
        birdAdapter.swim();
    }
}
