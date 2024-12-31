class Boat extends Vehicle implements Rentable {
    public Boat(String brand, String model, double rentalcost) {
        super(brand, model, rentalcost);
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
    }

    void move() {
        System.out.println("The Boat is moving");
    }

    @Override
    public double calculateRentalCost(int days) {
        return rentalcost * days;
    }
}