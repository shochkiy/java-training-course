package Interface;

public class Bird extends Animal implements CanRun {
    @Override
    public void eat() {
        System.out.println("Eat bird feed.");
    }

    @Override
    public void run() {
        System.out.println("Bird run!");
    }
}
