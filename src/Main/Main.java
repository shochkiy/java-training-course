package Main;

import Collections.MyArrayList;

public class Main {
    public static void main(String[] args) {
        MyArrayList students = new MyArrayList();
        students.add("Sotskiy");
        students.add("Lichman");
        students.add("Kudriashov");
        students.add("Makchnik");
        students.add("Strykun");
        students.remove(1);
        students.add("Smolianinov");
        students.remove("Strykun");
        for (int i =0; i<students.getSize(); i++) {
            System.out.println(students.get(i));
        }
        System.out.println(students.getSize());
    }
}
