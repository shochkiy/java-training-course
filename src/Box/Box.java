package Box;

public class Box {
    private double lenght;
    private double width;
    private double height;

    public double getLenght() {
        return lenght;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public Box(double lenght, double width, double height) {
        this.lenght = lenght;
        this.width = width;
        this.height = height;
    }

    public Box(Box box1, Box box2) {
        this.height = box1.height + box2.height;
        this.width = box1.width + box2.width;
        this.lenght = box1.lenght + box2.lenght;
    }

    private double volume() {
        return lenght*width*height;
    }

    public Box sumParameters (Box box) {
        return new Box(this.lenght+box.lenght, this.width+box.width, this.height+box.height);
    }

    public void showParameters () {
        System.out.println("lenght " + lenght);
        System.out.println("width " + width);
        System.out.println("height " + height);
    }
}
