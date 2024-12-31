public abstract class Product {
    protected int id ;
    protected String desc ;
    protected double price ;


    public Product(){
        this.id = 10 ;
        this.desc = "Yazan" ;
        this.price = 20 ;
    }
    public Product(int id , String desc , double price){
        this.id = id ;
        this.desc = desc ;
        this.price = price ;
    }

    public int getId() {
        return id;
    }
    public String getDesc(){
        return desc;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public abstract double getTotal(int q);

    public final void printProduct(){
        System.out.println("ID= " + id );
        System.out.println("Description= " + desc);
        System.out.println("Price= " + price);
    }
}
