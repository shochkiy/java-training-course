package Main;

import Box.Box;
import Inheritance.BoxWeight;

public class Main {
    public static void main(String[] args) {
        BoxWeight box10 = new BoxWeight(10,10,10,10);
        BoxWeight box5 = new BoxWeight(5,5,5,5);
        BoxWeight boxSum = new BoxWeight(box10, box5);
        BoxWeight boxSumParam = boxSum.sumParameters(box5);
        boxSum.showParameters();
        System.out.println(" ");
        boxSumParam.showParameters();
    }
}
