package Interface.HomeWork;

public class Cook extends Worker implements Cookable{
    public Cook(String name) {
        super(name);
    }

    @Override
    public void cookFood() {
        System.out.println("Cook Food!");
    }
}
