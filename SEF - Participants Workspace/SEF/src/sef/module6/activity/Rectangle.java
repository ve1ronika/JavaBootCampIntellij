package activity;

public class Rectangle extends Shape {

    private double length;
    private double breadth;

    public Rectangle(){System.out.println("I am Rectangle constructor");}

    public Rectangle(double length, double breadth){
        this.length=length;
        this.breadth=breadth;
    }
    public Double calculateArea(){return length*breadth;}
    public Double calculatePerimeter(){return 2*(length+breadth);}









}
