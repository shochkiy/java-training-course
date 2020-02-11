package Interface;

public class Cat extends Animal implements CanRun {
    @Override
    public void eat() {
        System.out.println("Eat whiskas.");
    }

    public void run() {
        System.out.println("Cat run!");
    }
}
