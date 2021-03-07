package activity;

public class Person {
    private String name;
    private int age;
    private String surname;

    public Person() {
        this.name = "Unknown";
        this.age = 0;
        this.surname = "Unknown";
    }

    public Person(String name, int age, String surname) {
        this.name = name;
        this.age = age;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws NameException {
        if (!name.matches("[a-zA-Z]+")){
            throw new NameException();
        }

        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) throws NameException {
        if (!name.matches("[a-zA-Z]+")){
            throw new NameException();
        }

        this.surname = surname;
    }

    public String introduction () {
        return "My name is " + name + " I am " + age + " years old";
    }
}

