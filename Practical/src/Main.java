public class Main {
    public static void main(String[] args) {
        Car c1 = new Car("BMW ||", "E36 ||", 300);
        c1.displayDetails();
        System.out.println("Car rental cost for Car is: " + c1.calculateRentalCost(2));
        c1.move();

        System.out.println("==================================================================");

        Boat b1 = new Boat("Kawasaki ||", "2024 ||", 10000);
        b1.displayDetails();
        System.out.println("Car rental cost for Boat is: " + b1.calculateRentalCost(2));
        b1.move();
        try {
            b1.setRentalCost(1);
            c1.setRentalCost(-1);
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }
    }
}