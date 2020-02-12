package Main;

import Interface.Anonym.Homework.Count;
import Interface.Anonym.Homework.Counter;
import Interface.Anonym.Homework.Director;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        Count count = new Count();
        System.out.println(director.force(count,2));

        String s = director.force(new Counter() {
            @Override
            public String report(int i) {
                return "Отчет за " + i + "мес.";
            }
        }, 3);
        System.out.println(s);
    }
}
