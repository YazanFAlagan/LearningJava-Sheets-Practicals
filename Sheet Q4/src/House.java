public class House {
    private String address;
    private int numberOfRooms;
    private double area;

    // Constructor
    public House(String address, int numberOfRooms, double area) {
        this.address = address;
        this.numberOfRooms = numberOfRooms;
        this.area = area;
    }

    // Default
    public House() {
        this.address = "يارب التجمع";
        this.numberOfRooms = 0;
        this.area = 0.0;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        if (area >= 0) {
            this.area = area;
        } else {
            System.out.println("Area must be Positive");
        }
    }

    // Calculate Method
    public double calculatePrice(double pricePerSquareMeter) {
        return area * pricePerSquareMeter;
    }
}