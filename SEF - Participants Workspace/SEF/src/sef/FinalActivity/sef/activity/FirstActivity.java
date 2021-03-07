package activity;

public class FirstActivity {


    public static void main (String[] args) {

        Employee em = new Employee();
        try {
            em.setName("Alex");
        } catch (NameException e) {
            System.out.println("Name should not contain  non-alphabetical characters");
        }
        try {
            em.setSurname("Johnson");
        } catch (NameException e) {
            System.out.println("Surname should not contain  non-alphabetical characters");
        }
        em.setAge(25);
        em.setJobTitle("Developer");
        em.setCompany("Asus");
        em.setSalary(3000);

        Employee em1 = new Employee();
        try {
            em1.setName("John");
        } catch (NameException e) {
            System.out.println("Name should not contain non-alphabetical characters");
        }
        try {
            em1.setSurname("Anders");
        } catch (NameException e) {
            System.out.println("Surname should not contain  non-alphabetical characters");
        }
        em1.setAge(39);
        em1.setJobTitle("QA Engineer");
        em1.setCompany("Apple");
        em1.setSalary(3500);

        if (em.getSalary() > em1.getSalary()){
            System.out.println("My name is " + em.getName() + " I am " + em.getAge() + " years old. I work as " + em.getJobTitle() + " in company " + em.getCompany() + ". My salary is "+em.getSalary());
            System.out.println("My name is " + em1.getName() + " I am " + em1.getAge() + " years old. I work as " + em1.getJobTitle() + " in company " + em1.getCompany() + ". My salary is "+em1.getSalary());
        } else{
            System.out.println("My name is " + em1.getName() + " I am " + em1.getAge() + " years old. I work as " + em1.getJobTitle() + " in company " + em1.getCompany() + ". My salary is "+em1.getSalary());
            System.out.println("My name is " + em.getName() + " I am " + em.getAge() + " years old. I work as " + em.getJobTitle() + " in company " + em.getCompany() + ". My salary is "+em.getSalary());
        }

        Person p = new Person("John", 23, "Smith");
        System.out.println(p.introduction());

        Employee e = new Employee();
        try {
            e.setName("Alex");
        } catch (NameException nameException) {
            System.out.println("Name should not contain  non-alphabetical characters");
        }
        e.setAge(36);
        e.setJobTitle("Developer");
        e.setCompany ("Dell");
        System.out.println(e.introduction());


        Students s = new Students();
        s.setSchoolName("1st Gymnasium");
        System.out.println("I study in " + s.getSchoolName());

        Calculator c = new Calculator();
        c.setA(10);
        c.setB(15);
        System.out.println ("This is calculator for number " +c.getA() + " and number " +c.getB() );
        System.out.println("The addition of numbers is " +c.addition());
        System.out.println("The substraction  of smallest number from biggest is " +c.substraction());
        System.out.println("The multiplication of numbers is " +c.multiplication());
        System.out.println("The devision biggest number by smallest is  " +c.devision());
    }
}
