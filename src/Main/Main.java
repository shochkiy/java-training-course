package Main;

import Interface.HomeWork.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Programmer prog1 = new Programmer("DIMA");
        Programmer prog2 = new Programmer("ZHEKA");
        Programmer prog3 = new Programmer("PASIA");
        Driver driv1 = new Driver("RUSLAN");
        Driver driv2 = new Driver("VLADIK");
        Cook cook1 = new Cook("MAKS");
        Cook cook2 = new Cook ("OLEZHKA");
        ArrayList<Worker> workers = new ArrayList<>();
        workers.add(prog1);
        workers.add(prog2);
        workers.add(prog3);
        workers.add(driv1);
        workers.add(driv2);
        workers.add(cook1);
        workers.add(cook2);
        for (Worker worker : workers) {
            worker.voice();
        }

        ArrayList<Programable> progers = new ArrayList<>();
        progers.add(prog1);
        progers.add(prog2);
        progers.add(prog3);
        for (Programable proger : progers) {
            proger.writeCode();
        }

        ArrayList<Cookable> cookers = new ArrayList<>();
        cookers.add(cook1);
        cookers.add(cook2);
        for (Cookable cooks : cookers) {
            cooks.cookFood();
        }

        ArrayList<Drivable> drivers = new ArrayList<>();
        drivers.add(driv1);
        drivers.add(driv2);
        for (Drivable driv : drivers) {
            driv.drive();
        }
    }
}
