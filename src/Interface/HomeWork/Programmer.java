package Interface.HomeWork;

public class Programmer extends Worker implements Programable {
    public Programmer(String name) {
        super(name);
    }

    @Override
    public void writeCode() {
        System.out.println("Write Code!");
    }
}
