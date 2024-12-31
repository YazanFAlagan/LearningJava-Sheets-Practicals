class Car extends Vehicle implements Rentable {
    public Car(String brand, String model, double rentalcost) {
        super(brand, model, rentalcost);
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
    }

    void move() {
        System.out.println("The Car is moving");
    }

    @Override
    public double calculateRentalCost(int days) {
        return rentalcost * days;
    }
}