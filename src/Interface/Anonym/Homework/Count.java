package Interface.Anonym.Homework;

public class Count implements Counter{
    @Override
    public String report(int i) {
        return "Oтчет за " + i + " месяцев";
    }
}
