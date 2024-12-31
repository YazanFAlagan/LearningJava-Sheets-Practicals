public class Main {
    public static void main(String[] args) {
        Manager m = new Manager("Youssef", 20, 500, "SAD Project");
        m.display();
        System.out.println("______________________________________________");
        Person p = new Person("Zoz", 19);
        p.display();
        System.out.println("______________________________________________");
        Employee e = new Employee("Shehab", 20, 1000);
        e.display();
    }
}