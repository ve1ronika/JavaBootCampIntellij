package activity;

public class Person_K {

    /* Person_K class is the superclass
     * Attributes : name, age
     */

    //Attributes
    private String name;
    private int age;

    //Behavior - write default constructor. Print 'I'm Person_I constructor'

    public Person_K (){
        this.name = "Unknown";
        this.age = 0;
        System.out.println("I'am Person constructor");

    }
    //Behavior - write parameterized constructor

    public Person_K(String name, int age){
        this.name = name;
        this.age = age;
    }
     // write getter for String name

    public String getName()
    {
        return name;
    }

    // write setter for String name
    public void setName(String name) {
        this.name = name;
    }

    // write getter for int age
    public int getAge() {
        return age;
    }

    // write setter for int age
    public void setAge(int age) {
        this.age = age;
    }
}








