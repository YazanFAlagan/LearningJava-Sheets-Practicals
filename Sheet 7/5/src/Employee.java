class Employee extends Person {
    private double salary;

    public Employee(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Salary: " + salary);
    }
}