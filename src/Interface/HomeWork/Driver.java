package Interface.HomeWork;

public class Driver extends Worker implements Drivable {
    @Override
    public void drive() {
        System.out.println("Drive Car!");
    }

    public Driver(String name) {
        super(name);
    }
}
