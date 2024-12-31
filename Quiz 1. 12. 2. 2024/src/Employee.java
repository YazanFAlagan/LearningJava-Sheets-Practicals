public class Employee {
    private String name;
    private String position;
    private double salary;
    public Employee() {
        this("Unknown", "Unknown", 0.0);
    }
    public Employee(String name, String position, double salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }
    public void giveAnnualRaise(double percentage) {
        if (percentage > 0) {
            salary += salary * (percentage / 100);
            System.out.println("Annual raise: " + percentage + "%");
        } else {
            System.out.println("Invalid.");
        }
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Don't enter Negative Salary");
        }
    }

    public String toString() {
        return "Employee: Name=" + name + position + salary;
    }}
