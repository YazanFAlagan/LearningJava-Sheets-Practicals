public class Main {
    public static void main(String[] args) {
        Person p = new Person("Yazan", 19);
        p.display();
        System.out.println("_________________________________________");
        Employee emp = new Employee("Youssef", 20, 3000);
        emp.display();
    }
}