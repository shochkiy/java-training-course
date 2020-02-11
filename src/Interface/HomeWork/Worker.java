package Interface.HomeWork;

public class Worker {
    private String name;

    public Worker(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void voice () {
        System.out.println(name);
    }
}
