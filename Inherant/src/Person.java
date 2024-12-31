public class Person {
    private int id ;
    private String name ;
    private int age ;

            //Default Constructor
    public Person(){
        System.out.println("Hello From Constructor");
        id = 101;
        name = "Yazan";
        age = 19;
    }

             //Parametrized Constructor
    public Person(int id , String name , int age ){
        setID(id);
        setName(name);
        setAge(age);
    }

            //Getter
    public int getID(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

            //Setter
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
            //Person Info
    public void printInfo() {
        System.out.println("ID= " +id);
        System.out.println("Name= " +name);
        System.out.println("Age= " +age);
    }
    }
