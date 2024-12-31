import java.util.Date;

public class Employee {
    private String Name ;
    private int Age ;
    private int Salary ;
    Date hiredate ;

    public Employee() {
    }

    public Employee(String name, int age, int salary) {
        Name = name;
        Age = age;
        Salary = salary;
        this.hiredate = new Date();
    }

    public String display() {
        return Name + " " + Age + " " + Salary + " " + hiredate ;
    }
}
