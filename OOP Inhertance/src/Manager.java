
public class Manager extends Employee {
    private double Netsalary ;
    private String Postition ;

    public Manager(String name, int age, int salary) {
//        super(name, age, salary);
        this.Postition = Postition ;
    }

    public String Display() {
        return super.display()+" "+Postition;
    }
}
