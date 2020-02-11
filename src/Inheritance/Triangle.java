package Inheritance;

public class Triangle extends Figure{
    private double c;

    public Triangle(double a, double b, double c) {
        super(a,b);
        this.c = c;
    }

    public Triangle(double a) {
        super(a,a);
        this.c = a;
    }

    @Override
    public double square() {
        double p = 0.5*(getA() + getB() + c);
        return Math.sqrt(p*(p - getA())*(p-getB())*(p-c));
    }
}
