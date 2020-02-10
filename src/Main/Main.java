package Main;

import Test.Vector;

public class Main {
    public static void main(String[] args) {
        /*Vector vec234 = new Vector(12.0,34.0,65.0);
        System.out.println("Length vec234 = " + vec234.lengthVector());
        Vector vec567 = new Vector(56.0,63.0,79.0);
        System.out.println("\nScalar vec234*vec567 = " + vec234.scalarMultiply(vec567));
        Vector vec = vec567.vectorMultiply(vec234);
        System.out.println(vec);
        System.out.println("\nlength vec234vec567 = " + vec.lengthVector());
        System.out.println("\ncos vec234vec567 and vec567 = " + vec.cosVec(vec567));
        Vector sumV = vec234.sumVector(vec567);
        System.out.println("\n length SumV = " + sumV.lengthVector());
        Vector diffV = vec567.diffVector(vec234);
        System.out.println("\n length diffV = " + diffV.lengthVector());
        Vector[] massive = Vector.massVector(1);
        System.out.println("massive[1] x = " + massive[0].getX());
        System.out.println("massive[1] y = " + massive[0].getY());
        System.out.println("massive[1] z = " + massive[0].getZ());*/

        Vector[] mass = Vector.massVector(2);
        System.out.println(mass[0].cosVec(mass[1]));
    }
}
