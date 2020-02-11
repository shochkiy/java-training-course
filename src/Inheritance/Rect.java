package Inheritance;

public class Rect extends Figure {
    public Rect(double a, double b) {
        super(a,b);
    }

    public Rect(double a) {
        super(a, a);
    }

    @Override
    public double square() {
        return getA()*getB();
    }
}
