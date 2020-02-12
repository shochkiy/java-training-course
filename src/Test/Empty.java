package Test;

public class Empty {
    private int a = 10;
    @Override
    public String toString() {
        String result = String.format("Пустой обьект %s", a);
       return  result;
    }
}
