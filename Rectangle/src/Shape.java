public class Shape extends Object{
    protected int id ;
    protected String color ;

    //Deaualt Constructor
    Shape(){
        id = 10 ;
        color = "White";
    }

    //Pre Constructor
    Shape(int id, String color){
        this.id = id ;
        this.color = color;
    }

    //Getter
    public int getId() {
        return id;
    }
    public String getColor() {
        return color;
    }
    public String getShape(){
        return "ID= " + id + "Color=" + color ;
    }

    //Setter
    public void setId(int id) {
        this.id = id;
    }
    public void setColor(String color) {
        this.color = color;
    }

    //Print
    @Override
    public String toString(){
        return "Shape Info : ID= " + id + " Color= " + color ;
    }
}