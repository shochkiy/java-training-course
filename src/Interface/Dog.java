package Interface;

public class Dog extends Animal implements CanRun {
    @Override
    public void eat() {
        System.out.println("Eat bone.");
    }

    public void run() {
        System.out.println("Dog run!");
    }
}
