package activity;

public class Employee extends Person {
    private String jobTitle;
    private String company;
    private int salary;

    public Employee () {
        this.jobTitle = "Unknown";
        this.company = "Unknown";
        this.salary = 0;
    }

    public Employee (String jobTitle, String company, int salary) {
        this.jobTitle = jobTitle;
        this.company = company;
        this.salary = salary;
    }

    public String getJobTitle(){
        return jobTitle;
    }

    public void setJobTitle(String jobTitle){
        this.jobTitle = jobTitle;
    }
    public String getCompany(){
        return company;
    }
    public void setCompany (String company){
        this.company= company;
    }
    public int getSalary(){
        return salary;
    }
    public void setSalary (int salary) {
        this.salary = salary;
    }

    public String introduction () {
        return "My name is " + getName() + " I am " + getAge() + " years old. I work as " + jobTitle + " in company " + company;
    }
}


