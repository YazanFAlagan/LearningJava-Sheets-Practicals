public class CProudct extends Product{
    private String brand;

    public CProudct() {
        super();
        this.brand = "Brand" ;
    }
    public CProudct(int id , String desc , String brand , double price) {
        super(id, desc , price) ;
        this.brand = brand ;
    }

    @Override
    public double getTotal(int q) {
        return q * price;
    }
    public void printProduct0() {
        super.printProduct();
    }
}
