public class Student extends Person{ //extends دي هيا ال ربطت بالبرسون
    private double gpa;
    private int level;

    //This is the Main Default Constructor
    public Student(){
        super();
        this.gpa = 3.272;
        this.level = 1;
    }

    //Parametrized Constructor
    public Student(int id, String name, int age, double gpa , int level){
        super(id,name,age);
        this.level=level;
        this.gpa=gpa;
    }

    //Get Function
    public int getLevel() {
        return level;
    }
    public double getGpa() {
        return gpa;
    }

        //Setter
        public void setGpa(double gpa ){
            if(gpa > 0)
                this.gpa = gpa ;
        }
        public void setLevel(int level ){
            if(level > 0)
                this.level = level ;
        }

    //Student Info
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("GPA= " +gpa);
        System.out.println("Level= " +level);
    }
}




