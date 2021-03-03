package activity;

public class AbstractionActivity {

    public static void main(String[] args) {
        Rectangle r = new Rectangle(5,6);
        r.setColor("red");

        System.out.println("Rectangle's color is " + r.getColor());
        System.out.println("Rectangle's perimeter is " + r.calculateArea());
        System.out.println("Rectangle's area is " + r.calculatePerimeter());

        Circle c = new Circle(5);
        c.setColor("blue");

        System.out.println("Rectangle's color is " + c.getColor());
        System.out.println("Rectangle's perimeter is " + c.calculatePerimeter());
        System.out.println("Rectangle's area is " + c.calculateArea());

    }
}
