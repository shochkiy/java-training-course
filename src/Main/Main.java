package Main;

import Inheritance.Figure;
import Inheritance.Rect;
import Inheritance.Triangle;

public class Main {
    public static void main(String[] args) {
        Figure rect = new Rect(5, 10);
        System.out.println(rect.square());
        Figure triangle = new Triangle(10);
        System.out.println(triangle.square());
    }
}
