public class Main {
    public static void main(String[] args) {

        System.out.println("---------------------------");

        Person p1 = new Person();
        p1.setID(101);
        p1.setName("Yazan");
        p1.setAge(19);
        p1.printInfo();

        System.out.println("---------------------------");

        Student s1 = new Student();
        System.out.println("Student 1");
        s1.printInfo();

        System.out.println("---------------------------");

        Student s2 = new Student(20,"Amir",20,3.1,1);
        System.out.println("Student 2");
        s2.printInfo();

        System.out.println("---------------------------");

        Professor f1 = new Professor(15, "DR.Walied", 32 , "Doctor" , 4000);
        System.out.println("Professor 1");
        f1.printInfo();

        System.out.println("---------------------------");

        Professor f2 = new Professor(15, "DR.Marwan", 30 , "Doctor" , 4000);
        System.out.println("Professor 2");
        f2.printInfo();

    }
}