public class Professor extends Person{
    private String Position;
    private double Salary;

    //This is the Main Default Constructor
    public Professor() {
        Position = "Doctor";
        Salary = 4000;
    }

    //Parametrized Constructor
    public Professor(int id , String name , int age , String Position, double Salary) {
        super(id,name,age);
        this.Position=Position;
        this.Salary=Salary;
    }

    //Get Function
    public String Position() {
        return Position;
    }

    public double getSalary() {
        return Salary;
    }

    //Setter
    public void setPosition(String Position) {
        this.Position = Position;
    }

    public void setSalary(double Salary) {
        if (Salary > 0)
            this.Salary = Salary;
    }

    //Professor Info
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Position= " + Position);
        System.out.println("Salary= " + Salary);
    }
}

