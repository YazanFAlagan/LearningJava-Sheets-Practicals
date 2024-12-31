
                //OOP
public class Student {
    private int id ;
    private String name ;
    private int age ;
    private double gpa ;
    public static int counter=0;

    //Opening Statement
    public void print() {
        System.out.println("Hello Student");
    }

            //Get Function
    public int getID(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public double getGpa(){
        return gpa;
    }

            //Set Function
    public void setID(int id ){
        if(id > 0)
            this.id = id ;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        if(age > 0)
            this.age = age;
    }
    public void setGpa(double gpa){
        if(gpa > 0)
            this.gpa = gpa;
    }

    //This is the Main Default Constructor
    public Student(){
        counter++;
        System.out.println("Hello From Constructor");
        id = 20;
        name = "Yazeid";
        age = 20;
        gpa = 0;
    }

    //Parametrized Constructor
public Student(int id , String name , int age , double gpa){
        counter++;
        setID(id);
        setName(name);
        setAge(age);
        setGpa(gpa);
}
                //Student Info
    public void printInfo() {
        System.out.println("ID= " +id);
        System.out.println("Name= " +name);
        System.out.println("Age= " +age);
        System.out.println("GPA= " +gpa);
    }
}
