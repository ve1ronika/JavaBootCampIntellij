package activity;

// class Employee_I must extend class Person_I. Complete code for the same
public class Employee_I extends Person_K {

	//Attributes
  private String title;
  private int salary;

	//Behavior - write default constructor. Print 'I'm an Employee_I Constructor'
	public Employee_I() {System.out.println("I'm an Employee_I Constructor");}
    // write getter for int salary
	public String getTitle()
	{return title;}

	// write setter for int salary
    public void setTitle(String title)
	{this.title=title;}

	// write getter for String title
	public int getSalary()
	{return salary;}

	// write setter for String title
	public void setSalary(int salary)
	{this.salary=salary;}
	}


