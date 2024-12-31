public class Rectangle extends Shape{
    private double width ;
    private double length;

    //Default Constructor
    public Rectangle(){
        super();
        width = 10 ;
        length = 10 ;
    }
    //Pro Constructor
    public Rectangle(int id, String color, double width, double length){
        super(id, color);
        this.width=width ;
        this.length=length;
    }

    //Getter
    public double getWidth() {
        return width;
    }
    public double getLength() {
        return length;
    }
    public double getArea(){
        return width * length ;
    }
    //Setter
    public void setLength(double length) {
        this.length = length;
    }
    public void setWidth(double width) {
        this.width = width;
    }


    public String toString(){
        return super.toString()+" ,Rectangle Info : Area= " +getArea();
    }
}
