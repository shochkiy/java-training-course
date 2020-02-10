package Box;

public class Box {
    private double lenght;
    private double width;
    private double height;
    private String nameEx;

    public Box(){
        lenght = 0;
        width = 0;
        height = 0;
        nameEx = "";
    };

    public Box(double lenght, double width, double height, String nameEx) {
        this.lenght = lenght;
        this.width = width;
        this.height = height;
        this.nameEx = nameEx;
    }

    public Box(Box box1, Box box2) {
        this.height = box1.height + box2.height;
        this.width = box1.width + box2.width;
        this.lenght = box1.lenght + box2.lenght;
        this.nameEx = box1.nameEx + "_" + box2.nameEx;
    }

    private double volume() {
        return lenght*width*height;
    }

    public Box sumParameters (Box box) {
        return new Box(this.lenght+box.lenght, this.width+box.width, this.height+box.height, this.nameEx+"_"+box.nameEx + "_method");
    }

    public void showParameters () {
        System.out.println(this.nameEx+":");
        System.out.println("lenght " + lenght);
        System.out.println("width " + width);
        System.out.println("height " + height + "\n");
    }
}
