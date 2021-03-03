package activity;

public class Circle extends Shape {

    private double side;

    public Circle() {
        System.out.println("I am Circle constructor");
    }

    public Circle(double side;) {
        this.side = side;
    }
    public Double calculateArea(){return 3.14*(side*side);}
    public Double calculatePerimeter(){return 2*3.14*side;}
}