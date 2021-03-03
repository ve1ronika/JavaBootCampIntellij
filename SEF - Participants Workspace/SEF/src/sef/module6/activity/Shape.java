package activity;

public abstract class Shape {

	public String color;
	public Shape(){System.out.println("I'm a Shape constructor");}
	
	// Complete the code and Add abstract method calculateArea() and calculatePerimeter() with return type as double
	public abstract Double calculateArea();
	public abstract Double calculatePerimeter();

	public void setColor(String c) {
		color = c;
	}
	public String getColor() {
		return color;
	}
}
