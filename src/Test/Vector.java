package Test;

public class Vector {
    private double x;
    private double y;
    private double z;

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    // Возвращает длину вектора вызываемого экземпляра.
    public double lengthVector(){
        return Math.sqrt(x*x + y*y + z*z);
    }

    //Возвращает скалярное произведение вектора вызываемого экземпляра на вектор передаваемого экземпляра.
    public double scalarMultiply(Vector vector) {
        return this.x * vector.x + this.y * vector.y + this.z * vector.z;
    }

    //Возвращает новый экземпляр с вектором значения которого равны векторному произвидению вызываемого экземпляра на передаваемый.
    public Vector vectorMultiply(Vector vector) {
        return new Vector(
                this.y*vector.z - this.z*vector.y,
                this.z*vector.x - this.x*vector.z,
                this.x*vector.y - this.y*vector.x);
    }

    //Возвращает косинус угла между вектором вызываемым и передаваемым
    public double cosVec(Vector vector) {
        return scalarMultiply(vector)/(this.lengthVector() * vector.lengthVector());
    }

    // Возвращает новый экземпляр с вектором значения которого равны сумме векторов вызываемого экземпляра и передаваемого.
    public Vector sumVector(Vector vector) {
        return new Vector(
                this.x + vector.x,
                this.y - vector.y,
                this.z - vector.z);
    }

    //Возвращает новый экземпляр с вектором значения которого равны разности вектора вызываемого экземпляра минус передаваемого.
    public Vector diffVector(Vector vector) {
        return new Vector(
                this.x - vector.x,
                this.y - vector.y,
                this.z - vector.z);
    }

    //Возвращает массив размером N со случайными векторами
    public static Vector[] massVector(int N) {
        Vector[] massVec = new Vector[N];
        for (int i = 0; i < N; i++) {
            massVec[i] = new Vector(Math.random(),Math.random(),Math.random());
        }
        return massVec;
    }

    @Override
    public String toString() {
        return getX() + " " + getY() + " " + getZ() + " values";
    }
}
