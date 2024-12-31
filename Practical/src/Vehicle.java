abstract class Vehicle {
    String brand;
    String model;
    double rentalcost;
    private static int totalVehicles = 0;

    public Vehicle(String brand, String model, double rentalcost) {
        this.brand = brand;
        this.model = model;
        this.rentalcost = rentalcost;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getRentalCost() {
        return rentalcost;
    }

    public void setRentalCost(double rentalCost) {
        if (rentalCost < 0) {
            throw new IllegalArgumentException("Cannot Enter Negative Number");
        }
        this.rentalcost = rentalCost;
        totalVehicles++;
    }

    public static int getTotalVehicles() {
        return totalVehicles;
    }

    public void displayDetails() {
        System.out.println("The Brand name is: " + brand + " The Model Is: " + model +
                " The Rental Cost is: " + rentalcost);
    }
}