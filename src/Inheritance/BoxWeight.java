package Inheritance;

import Box.Box;

public class BoxWeight extends Box {
    private double weigth;

    public BoxWeight(double lenght, double width, double height, double weigth) {
        super(width,height,lenght);
        this.weigth = weigth;
    }

    public BoxWeight(BoxWeight box1, BoxWeight box2) {
        super(box1, box2);
        this.weigth = box1.weigth + box2.weigth;
    }

    public BoxWeight sumParameters(BoxWeight box) {
        return new BoxWeight(this.getLenght()+box.getLenght(),this.getWidth()+box.getWidth(),this.getHeight()+box.getHeight(), this.weigth+box.weigth );
    }

    @Override
    public void showParameters() {
        super.showParameters();
        System.out.println("Weight " + this.weigth);
    }
}
